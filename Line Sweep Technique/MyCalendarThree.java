// Time Complexity - O(n)
// Space Complexity - O(n)
class MyCalendarThree {
    private Map<Integer, Integer> events = new TreeMap<>();
    public MyCalendarThree() {
        
    }
    
    public int book(int startTime, int endTime) {
        
        events.put(startTime, events.getOrDefault(startTime, 0)+1);
        events.put(endTime, events.getOrDefault(endTime, 0)-1);
        int maxBooking = 0;
        int currBooking = 0;
        for(int delta : events.values()){
            currBooking += delta;
            maxBooking = Math.max(maxBooking, currBooking);
        }
        return maxBooking;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */
