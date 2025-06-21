class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
        this.stack=new Stack<>();
        this.min=new Stack<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if(min.isEmpty()||min.peek()>val){
            min.add(val);
        }else{
            min.add(min.peek());
        }
        return;
    }
    
    public void pop() {
        stack.pop();
        min.pop();
        return;
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