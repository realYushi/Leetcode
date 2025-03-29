class BrowserHistory {
    int curr;
    int size;
    List<String> list;


    public BrowserHistory(String homepage) {
        this.list=new ArrayList<>();
        this.list.add(homepage);
        this.curr=0;
        this.size=1;
    }
    
    public void visit(String url) {
        this.curr++;
        if(this.list.size()==this.curr){
            this.list.add(url);
        }else{
            this.list.set(this.curr,url);
        }
        this.size=this.curr+1;
    }
    
    public String back(int steps) {
        this.curr=Math.max(0,this.curr-steps);
        return this.list.get(this.curr);
        
    }
    
    public String forward(int steps) {
        this.curr=Math.min(this.size-1,this.curr+steps);
        return this.list.get(this.curr);
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */