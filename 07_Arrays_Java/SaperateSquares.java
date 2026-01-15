class Solution {
    boolean check(int[][] squares, double mid_y, double total) {
        double botArea = 0.000;
        for(int[] square : squares) {
            
            double y = square[1];
            double l = square[2];
            double top_y = y+l;
            double bot_y = y;
            if(mid_y >= top_y) {
                botArea += l*l;
            }
            else if(mid_y > y){
                botArea += l*(mid_y - y);
            }
        }
        return botArea >= total/2.0;
    }
    public double separateSquares(int[][] squares) {
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;
        double total = 0.0000;

        for(int[] square: squares) {
            double x = square[0];
            double y = square[1];
            double l = square[2];
            total += l*l;
            
            low = Math.min(low, y);
            high = Math.max(high, y+l);
        }

        double result = 0.0000;
        while(high-low > 1e-5) {
            double mid_y = low + (high-low)/2;
            result = mid_y;
            if(check(squares, mid_y, total)){
                high = mid_y;
            } 
            else low = mid_y;
        }
        return result;
    }
}
