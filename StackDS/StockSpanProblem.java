public ArrayList<Integer> calculateSpan(int[] arr) {
        
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            while(!st.isEmpty() && arr[i] >= arr[st.peek()]) st.pop();
            if(st.isEmpty()) ans.add(i+1);
            else ans.add(i - st.peek());
            st.push(i);
        }
        return ans;
    }
