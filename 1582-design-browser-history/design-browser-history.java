class BrowserHistory {
    List<String> list; 
    int index;
    int size;

    public BrowserHistory(String homepage) {
        this.index=0;
        this.size=1;
        this.list= new ArrayList<>();
        this.list.add(homepage);
    }
    
    public void visit(String url) {
        index++;
        if(index==list.size()){
            list.add(url);
        }else{
            list.set(index,url);
        }
        size=index+1;
    }
    
    public String back(int steps) {
        index=Math.max(0,index-steps);
        return list.get(index);
    }
    
    public String forward(int steps) {
        index=Math.min(this.size-1, index+steps);
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