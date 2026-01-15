class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int currStrip = 1;
        int h_max_strip = 1;
        int v_max_strip = 1;
        int prevStrip = hBars[0];
        for(int i = 1; i<hBars.length; i++) {
            if(hBars[i] == prevStrip + 1) currStrip += 1;
            else currStrip = 1;
            h_max_strip = Math.max(h_max_strip, currStrip);
            prevStrip = hBars[i];
        }
        currStrip = 1;
        prevStrip = vBars[0];
        for(int i=1; i<vBars.length; i++) {
            if(vBars[i] == prevStrip +1) currStrip += 1;
            else currStrip = 1;
            v_max_strip = Math.max(v_max_strip, currStrip);
            prevStrip = vBars[i];
        }
        int maxArea = Math.min(v_max_strip, h_max_strip) + 1;
        return maxArea * maxArea;
    }
}
