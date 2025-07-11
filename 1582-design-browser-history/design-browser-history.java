class BrowserHistory {
    List<String> list; 
    int size;
    int index;

    public BrowserHistory(String homepage) {
        this.list=new ArrayList<>();
        this.size=1;
        this.index=0;
        list.add(homepage);
    }
    
    public void visit(String url) {
        index++;
        if(index==list.size()){
            list.add(url);
        }else{
            list.set(index,url);
        }
        this.size=this.index+1;
    }
    
    public String back(int steps) {
        index=Math.max(0,index-steps);
        return list.get(index);
    }
    
    public String forward(int steps) {
        index=Math.min(this.size-1,index+steps);    
        return list.get(index);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */