private static void reverse(Queue<Integer> q) {
        // Using stack
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()) {
            st.push(q.remove());
        }
        while(!st.isEmpty()) q.add(st.pop());
        // Using array
        int n = q.size();
        int[] arr = new int[n];
        int i = 0;
        while(!q.isEmpty()) {
            arr[i] = q.remove();
            i++;
        }
        for(i = n-1; i>=0; i--) {
            q.add(arr[i]);
        }
    }
