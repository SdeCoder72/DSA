class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[n-1] = 0;
        st.push(arr[n-1]);
        int count;
        for(int i = n-2; i>=0; i--) {
            count = 0;
            while(!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
                count++;
            }
            if(!st.isEmpty())  count++;
            ans[i] = count;
            st.push(arr[i]);
        }
        return ans;
    }
}
