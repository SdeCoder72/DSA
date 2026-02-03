// Time Complexity - O(n log n)
// Space Complexity - O(n)
class Solution {
    public List<List<Long>> splitPainting(int[][] segments) {
        Map<Integer, Long> events = new TreeMap<>();
        for(int[] segment : segments){
            int start = segment[0];
            int end = segment[1];
            int color = segment[2];

            events.put(start, events.getOrDefault(start,0L) + color);
            events.put(end, events.getOrDefault(end,0L) - color);
        }
        List<List<Long>> ans = new ArrayList<>();
        long currSum = 0;
        Integer start = null;

        for(Map.Entry<Integer, Long> entry : events.entrySet()){
            int end = entry.getKey();
            if(start!= null && currSum > 0){
                ans.add(Arrays.asList((long)start, (long)end, currSum));
            }
            currSum += entry.getValue();
            start = end;
        }
        
        return ans;
    }
}
