class BrowserHistory {
    int cur;
    int size;
    List<String> history;
    public BrowserHistory(String homepage) {
        this.cur=0;
        this.size=1;
        this.history=new ArrayList<>();
        this.history.add(homepage);
    }
    
    public void visit(String url) {
        this.cur++;
        if(this.cur>=this.history.size()){
            this.history.add(url);
        }else{
            this.history.set(this.cur,url);
        }
        this.size=this.cur+1;
        
    }
    
    public String back(int steps) {
        this.cur=Math.max(0,this.cur-steps);
        return this.history.get(this.cur);
        
    }
    
    public String forward(int steps) {
        this.cur=Math.min(this.size-1,this.cur+steps);
        return this.history.get(this.cur);
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */