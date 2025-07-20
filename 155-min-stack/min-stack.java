class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        this.stack= new Stack<>();
        this.minStack= new Stack<>();
    }
    
    public void push(int val) {
        this.stack.add(val);
        if(this.minStack.isEmpty()||val<this.minStack.peek()){
            this.minStack.add(val);
        }else{
            this.minStack.add(this.minStack.peek());
        }
    }
    
    public void pop() {
        this.stack.pop();
        this.minStack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
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