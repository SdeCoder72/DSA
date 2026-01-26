
// Approach-1. Difference Array Technique(DAT)
//T.C : O(n)
//S.C : O(max year) diffArr size
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diffArr = new int[2051];
        for(int[] log : logs){
            int start = log[0];
            int end = log[1];

            diffArr[start] += 1;
            diffArr[end] -= 1;
        }
        int maxPop = 0;
        int currPop = 0;
        int minYear = 2050;
        for(int i=1950; i<2051; i++){
            currPop += diffArr[i];
            if(currPop > maxPop){
                maxPop = currPop;
                minYear = i;
            }
        }
        return minYear;
    }
}

// Approach-. Line Sweep Technique 
//T.C : O(n)
//S.C : O(max year) 
class Solution {
    public int maximumPopulation(int[][] logs) {
        List<int[]> events = new ArrayList<>();
        
        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            
        
            events.add(new int[]{birth, 1});
            events.add(new int[]{death, -1});
        }
        
        // If years are equal, process deaths before births to handle the "not counted in the year they die" rule correctly.
        Collections.sort(events, (a, b) -> {
            if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        
        int maxPop = 0;
        int currPop = 0;
        int minYear = 0;
        
        for (int[] event : events) {
            int year = event[0];
            int delta = event[1];
            
            currPop += delta;
            
            if (currPop > maxPop) {
                maxPop = currPop;
                minYear = year;
            }
        }
        
        return minYear;
    }
}
