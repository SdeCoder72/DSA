

class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }
    
    public int compareTo(Pair p) {
            if(this.freq == p.freq) return Integer.compare(this.ele, p.ele);
          return Integer.compare(this.freq, p.freq);  
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // S.C - O(n)
        for(int ele : nums) {  // T.C - O(n)
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // S.C - O(k)
        for(int val : map.keySet()){  // T.C - O(n log k)
            int freq = map.get(val);
            pq.add(new Pair(val, freq));
            if(pq.size() > k) pq.remove();
        }
        int[] ans = new int[k];
        int i = 0;
        while(!pq.isEmpty()) {
            Pair top = pq.remove();
            ans[i++] = top.ele;
        }
        return ans;
    }
}
