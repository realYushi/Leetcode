class MyStack {
    Queue<Integer> q;

    public MyStack() {
        this.q=new LinkedList<>();
    }
    
    public void push(int x) {
        this.q.add(x);
        for(int i=0;i<this.q.size()-1;i++){
            this.q.add(this.q.remove());
        }
        
    }
    
    public int pop() {
        return this.q.remove();
        
    }
    
    public int top() {
        return this.q.element();
        
    }
    
    public boolean empty() {
        return this.q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */