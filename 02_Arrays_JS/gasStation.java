// Brute force approach (TLE)
public int startStation(int[] gas, int[] cost) {
        // code here
        int n = gas.length;
        int i;
        int ans;
        for(i = 0; i<n; i++) {
            if(gas[i] < cost[i]) continue;
            int j = (i+1) %n;
            ans = gas[i] - cost[i] + gas[j];
            while(j != i) {
                if(ans < cost[j]) break;
                int costj = cost[j];
                j = (j+1)%n;
                ans = ans + gas[j] - costj;
            }
            if(j == i) return i;
        }
        
        return -1;
    }

// Optimal approach

public int startStation(int[] gas, int[] cost) {
        // code here
        int n = gas.length;
        int gasSum = 0;
        int costSum = 0;
        for(int i = 0; i<n; i++) {
            gasSum += gas[i];
        }
        for(int i = 0; i<n; i++) {
            costSum += cost[i];
        }
        if(costSum > gasSum) return -1;
        int total = 0;
        int idx = 0;
        for(int i = 0; i<n; i++) {
            total += gas[i] - cost[i];
            if(total < 0) {
                idx = i+1;
                total = 0;
            }
        }
        return idx;
    }
