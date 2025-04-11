class BrowserHistory {
    List<String> list;
    int i;
    int s;

    public BrowserHistory(String homepage) {
        this.list=new ArrayList<>();
        this.list.add(homepage);
        this.i=0;
        this.s=1;
    }
    
    public void visit(String url) {
        this.i++;
        if(this.i>=this.list.size()){
            this.list.add(url);
        }else{
            this.list.set(this.i,url);
        }
        this.s=this.i+1;
    }
    
    public String back(int steps) {
        this.i=Math.max(0,this.i-steps);
        return this.list.get(this.i);
        
    }
    
    public String forward(int steps) {
        
        this.i=Math.min(this.s-1,this.i+steps);
        return this.list.get(this.i);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */