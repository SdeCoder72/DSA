class Solution {
    public Map<Integer, Integer> events = new TreeMap<>();
    public boolean carPooling(int[][] trips, int capacity) {
        for(int[] trip : trips){
            int delta = trip[0];
            events.put(trip[1], events.getOrDefault(trip[1], 0)+ delta);
            events.put(trip[2], events.getOrDefault(trip[2], 0)- delta);
        }
        int currNum = 0;
        for(int delta : events.values()){
            currNum += delta;
            if(currNum > capacity) return false;
        }
        return true;
    }
}
