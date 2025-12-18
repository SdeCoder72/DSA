class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++) {
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                int h = arr[st.pop()];
                if(!st.isEmpty()) {
                    ans = Math.max(ans, h * (i - st.peek() - 1));
                }
                else ans = Math.max(ans, h * i);
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            int h = arr[st.pop()];
            if(!st.isEmpty()) {
                ans = Math.max(ans, h * (n-st.peek() - 1));
            }
            else ans = Math.max(ans, h * n);
        }
        return ans;
    }
    public int maximalRectangle(char[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[] height = new int[col];
        int ans = 0;
        for(int i= 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                if(arr[i][j] == '0') height[j] = 0;
                else height[j] += 1; 
            }
            ans = Math.max(ans, largestRectangleArea(height));
        }
        return ans;
    }
}
