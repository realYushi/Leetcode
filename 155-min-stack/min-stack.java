class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        if(min.isEmpty()||val <= min.peek()){
            min.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        if(min.peek()==top){
            min.pop();
        }
        
        
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */