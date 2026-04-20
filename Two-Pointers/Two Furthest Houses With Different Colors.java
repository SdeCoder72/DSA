// Time complexity - O(n), two pass 
// Space complexity - O(1)

class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int result = 0;
        for(int j = 0; j < n; j++){
            if(colors[j] != colors[n-1]){
                result = Math.max(result, (n-1) - j);
                break;
            }
        }
        for(int j = n-1; j >= 0; j--){
            if(colors[0] != colors[j]){
                result = Math.max(result, j - 0);
                break;
            }
        }
        return result;
    }
}

// Time complexity - O(n)
// Space complexity - O(1)

class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int result = 0;
        for(int j = 0; j < n; j++){
            if(colors[j] != colors[n-1]){
                result = Math.max(result, (n-1) - j);
            }
            if(colors[0] != colors[j]){
                result = Math.max(result, j);
            }
        }
        
        return result;
    }
}
