class KthLargest {
    Queue<Integer> q;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.q = new PriorityQueue<>();
        for (int n : nums) {
            q.add(n);
            if (k < q.size()) {
                q.remove();
            }
        }
    }

    public int add(int val) {
        this.q.add(val);
        if (k < q.size()) {
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