class BrowserHistory {
    List<String> history;
    int size;
    int curr;

    public BrowserHistory(String homepage) {
        this.history=new ArrayList();
        this.history.add(homepage);
        this.size=1;
        this.curr=0;
    }
    
    public void visit(String url) {
        this.curr++;
        if(this.curr>=this.history.size()){
            this.history.add(url);
        }else{
            this.history.set(curr,url);
        }
        this.size=this.curr+1;
    }
    
    public String back(int steps) {
        this.curr=Math.max(0,this.curr-steps);
        return this.history.get(this.curr);
    }
    
    public String forward(int steps) {
        this.curr=Math.min(this.size-1,this.curr+steps);
        return this.history.get(this.curr);
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */