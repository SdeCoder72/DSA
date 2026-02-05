
class Solution {
    int countPairs(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e : arr) map.put(e, map.getOrDefault(e,0)+1);
        int pairs = 0;
        for(int key : map.keySet()){
            int rem1 = key - k;
            int rem2 = key + k;
            if(map.containsKey(rem1)) pairs += map.get(key) * map.get(rem1);
            if(map.containsKey(rem2)) pairs += map.get(key) * map.get(rem2);
        }
        return pairs/2;
    }
}
