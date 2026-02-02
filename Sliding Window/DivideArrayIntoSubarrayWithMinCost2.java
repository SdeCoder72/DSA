class Solution {
    private long currSum =0;
    private int kMinusOne;
    private TreeMap<Integer, Integer> minEle = new TreeMap<>();
    private TreeMap<Integer, Integer> Remaining = new TreeMap<>();
    private int minEleCount = 0;

    private void add(int val){
        minEle.put(val, minEle.getOrDefault(val, 0) + 1);
        currSum += val;
        minEleCount++;
        if(minEleCount > kMinusOne){
            int largestInMinEle = minEle.lastKey();
            removeFromMap(minEle, largestInMinEle);
            currSum -= largestInMinEle;
            minEleCount--;
            Remaining.put(largestInMinEle, Remaining.getOrDefault(largestInMinEle, 0) + 1);
        }
    }
    private void remove(int val){
        if(minEle.containsKey(val)){
            removeFromMap(minEle, val);
            currSum -= val;
            minEleCount--;
        } else{
            removeFromMap(Remaining,val);
        }
        if(minEleCount < kMinusOne && !Remaining.isEmpty()){
            int smallestInRemaining = Remaining.firstKey();
            removeFromMap(Remaining,smallestInRemaining);
            minEle.put(smallestInRemaining, minEle.getOrDefault(smallestInRemaining, 0) + 1);
            currSum += smallestInRemaining;
            minEleCount++;
        }
    }
    private void removeFromMap(TreeMap<Integer, Integer> map, int val){
        int count = map.get(val);
        if(count == 1) map.remove(val);
        else map.put(val, count-1);
    }
    
    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        kMinusOne = k-1;
        long minCost = Long.MAX_VALUE;
        for(int i = 1; i<n; i++){
            add(nums[i]);
          // if window exceeds distance, remove ele
            if(i > dist+1){
                remove(nums[i-dist-1]);
            }
          // window is large enough to pick k-1 ele
            if(i >= kMinusOne){
               if(minEleCount == kMinusOne){
                   minCost= Math.min(minCost, currSum + nums[0]);
               }
            }
        }
        return minCost;
    }
}
