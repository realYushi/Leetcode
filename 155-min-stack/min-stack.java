class MinStack {

        Stack<Integer> stack;
        Stack<Integer> min;
    public MinStack() {
        this.stack=new Stack<>();
        this.min=new Stack<>();
    }
    
    public void push(int val) {
        this.stack.add(val);
        if(this.min.isEmpty()||val<this.min.peek()){
            this.min.add(val);
        }else{
            this.min.add(this.min.peek());
        }
    }
    
    public void pop() {
        this.stack.pop();
        this.min.pop();
        
    }
    
    public int top() {
        return this.stack.peek();
        
    }
    
    public int getMin() {
        return this.min.peek();
        
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