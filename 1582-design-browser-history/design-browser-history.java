class BrowserHistory {
    List<String> history;
    int size;
    int index;


    public BrowserHistory(String homepage) {
        this.history=new ArrayList<>();
        history.add(homepage);
        this.size=1;
        this.index=0;
    }
    
    public void visit(String url) {
        this.index++;
        if(this.index==this.history.size()){
            this.history.add(url);
        }else{
            this.history.set(this.index,url);
        }
        this.size=index+1;
    }
    
    public String back(int steps) {
        this.index=Math.max(0,this.index-steps);
        return history.get(index);
    }
    
    public String forward(int steps) {
        this.index=Math.min(this.size-1,this.index+steps);
        return history.get(index);
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */