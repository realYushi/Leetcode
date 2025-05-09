class KthLargest {
    int k;
    Queue<Integer> q;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.q=new PriorityQueue<>();
        for(int n:nums){
            this.q.add(n);
            if(this.k<this.q.size()){
                this.q.remove();
            }
        }
        
    }
    
    public int add(int val) {
        this.q.add(val);
        if(this.k<this.q.size()){
            this.q.remove();
        }
        return this.q.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */