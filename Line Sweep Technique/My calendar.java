
class MyCalendarTwo {
    Map<Integer, Integer> events = new TreeMap<>();
    public MyCalendarTwo() {
        
    }
    
    public boolean book(int startTime, int endTime) {
        events.put(startTime, events.getOrDefault(startTime, 0)+1);
        events.put(endTime, events.getOrDefault(endTime, 0)-1);
        int count = 0;
        for(int delta : events.values()){
            count += delta;
            if(count>2){
                events.put(startTime, events.getOrDefault(startTime, 0)-1);
                events.put(endTime, events.getOrDefault(endTime, 0)+1);
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */
