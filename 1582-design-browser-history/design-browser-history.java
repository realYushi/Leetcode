class BrowserHistory {
    List<String> history;
    int current;
    int size;

    public BrowserHistory(String homepage) {
        this.history=new ArrayList<>();
        this.history.add(homepage);
        this.current=0;
        this.size=1;
    }
    
    public void visit(String url) {
        if(this.current<this.history.size()-1){
        this.current++;
        this.history.set(this.current,url);
        }else{
            this.current++;
            this.history.add(url);
        }
        this.size=this.current+1;
        
    }
    
    public String back(int steps) {
        this.current=Math.max(0,this.current-steps);
        return this.history.get(this.current);
    }
    
    public String forward(int steps) {
        this.current=Math.min(this.size-1,this.current+steps);
        return this.history.get(this.current);

        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */