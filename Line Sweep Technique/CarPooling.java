
// Line Sweep Technique 
// Time Complexity - O(n)
// Space Complexity - O(n)
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Map<Integer, Integer> events = new TreeMap<>();
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

// Difference Array technique 
// Time Complexity - O(n)
// Space Complexity - O(1)
class Solution {

    public boolean carPooling(int[][] trips, int capacity) {
        int[] events = new int[1001];
        for(int[] trip : trips){
            int delta = trip[0];
            events[trip[1]] += delta;
            events[trip[2]] += -delta;
        }
        int currNum = 0;
        for(int delta : events){
            currNum += delta;
            if(currNum > capacity) return false;
        }
        return true;
    }
}
