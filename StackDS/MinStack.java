class MinStack {
        Stack<Integer> st;
        Stack<Integer> minSt;
    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            minSt.push(val);
        }
        int minVal = Math.min(val, minSt.peek());
        minSt.push(minVal);
        st.push(val);
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
