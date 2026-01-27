//Line Sweep Technique  lecture 4 maximum rooms

// Approach - 1 (Using Ordered Map)
// Time Complexity: O(n log n)
// Space Complexity: O(n)
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Map<Integer, Integer> events = new TreeMap<>();
        int n = start.length;
        for(int i = 0; i < n; i++){
            events.put(start[i], events.getOrDefault(start[i], 0)+1);
            events.put(end[i], events.getOrDefault(end[i], 0)-1);
        }
        int maxRooms = 0;
        int currRooms = 0;
        for(int delta : events.values()){
            currRooms += delta;
            maxRooms = Math.max(maxRooms, currRooms);
        }
        return maxRooms;
    }
}

// Approach - 2 (Using Arraylist) 
// Time Complexity: O(n log n)
// Space Complexity: O(n)
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        List<int[]> events = new ArrayList<>();
        int n = start.length;
        for(int i = 0; i < n; i++){
            events.add(new int[] {start[i], 1});
            events.add(new int[] {end[i],-1});
        }
        // Sort the arraylist 
        Collections.sort(events, (a, b) ->{
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        int maxRooms = 0;
        int currRooms = 0;
        for(int[] event : events){
            currRooms += event[1];
            maxRooms = Math.max(maxRooms, currRooms);
        }
        return maxRooms;
    }
}

// Approach - 3 (Sorting start and end)
// Time Complexity: O(n log n)
// Space Complexity: O(1)
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        int n = start.length;
        int startPtr = 0, endPtr = 0;
        int maxRooms = 0;
        int currRooms = 0;
        while(startPtr < n){
            if(start[startPtr] < end[endPtr]){
                currRooms++;
                startPtr++;
            }
            else{
                currRooms--;
                endPtr++;
            }
            maxRooms = Math.max(maxRooms, currRooms);
        }
        return maxRooms;
    }
}
