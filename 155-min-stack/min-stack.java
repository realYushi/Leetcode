class MinStack {
    Stack<Integer> main;
    Stack<Integer> min;

    public MinStack() {
        this.main=new Stack<>();
        this.min=new Stack<>();
    }
    
    public void push(int val) {
        if(min.size()==0||this.min.peek()>=val){
            this.min.push(val);
        }
        this.main.push(val);
    }
    
    public void pop() {
        int top=main.pop();
        if(this.min.peek()==top){
            min.pop();
        }
    }
    
    public int top() {
        return main.peek();
        
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