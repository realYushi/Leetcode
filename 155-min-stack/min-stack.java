class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
        this.stack=new Stack<>();
        this.min=new Stack<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if(stack.size()==1){
            min.add(val);
        }else{
            if(val<min.peek()){
                min.add(val);
            }
            else{
                min.add(min.peek());
            }
        }
        return;
    }
    
    public void pop() {
        min.pop();
        stack.pop();
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