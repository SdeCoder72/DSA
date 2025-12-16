public int celebrity(int arr[][]) {
        
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++) st.push(i);
        while(st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            boolean aFlag = true;
            boolean bFlag = true;
            if(arr[a][b] == 1 || arr[b][a] == 0) aFlag = false;
            else if(arr[b][a] == 1 || arr[a][b] == 1) bFlag = false;
            if(aFlag) st.push(a);
            if(bFlag) st.push(b);
        }
        if(st.isEmpty()) return -1;
        int ele = st.pop();
        for(int j = 0; j<n; j++) {
            if(j == ele) continue;
            if(arr[ele][j] == 1) return -1;
        }
        for(int i =0; i<n; i++) {
            if(i == ele) continue;
            if(arr[i][ele] == 0) return -1;
        }
        return ele;
    }
