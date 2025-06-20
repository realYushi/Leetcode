class KthLargest {
    int k=0;
    Queue<Integer> q;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.q=new PriorityQueue<>();
        for(int n:nums){
            q.add(n);
            if(q.size()>k){
                q.remove();
            }
        }
    }
    
    public int add(int val) {
        q.add(val);
            if(q.size()>k){
                q.remove();
            }
            return q.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */