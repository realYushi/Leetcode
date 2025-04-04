class BrowserHistory {
    List<String> history;
    int size;
    int i;

    public BrowserHistory(String homepage) {
        this.history=new LinkedList<>();
        this.history.add(homepage);
        this.size=1;
        this.i=0;
        
    }
    
    public void visit(String url) {
        this.i++;
        if(this.i>=this.history.size()){
            this.history.add(url);
        }else{
            this.history.set(this.i,url);
        }
        this.size=this.i+1;
    }
    
    public String back(int steps) {
        this.i=Math.max(0,this.i-steps);
        return this.history.get(this.i);
    }
    
    public String forward(int steps) {
        this.i=Math.min(this.size-1,this.i+steps);
        return this.history.get(this.i);

        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */