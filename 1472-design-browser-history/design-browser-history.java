/*
 * @lc app=leetcode id=1472 lang=java
 *
 * [1472] Design Browser History
 */

// @lc code=start

class BrowserHistory {

    List<String> list;
    int size;
    int index;
    public BrowserHistory(String homepage) {
        this.list=new LinkedList<>();
        this.list.add(homepage);
        this.size=1;
        this.index=0;
    }
    
    public void visit(String url) {
        index++;
        if(index==this.list.size()){
            list.add(url);
        }else{
            this.list.set(index,url);
        }
        this.size=index+1;
    }

    
    public String back(int steps) {
        this.index=Math.max(0,this.index-steps);
        return list.get(this.index);
    }
    
    public String forward(int steps) {
        this.index=Math.min(this.size-1, this.index+steps);
        return list.get(this.index);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
// @lc code=end

