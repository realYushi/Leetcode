class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q= new PriorityQueue<>();
        for(int n:nums){
            q.add(n);
            if(q.size()>k){
                q.remove();
            }

        }
        return q.peek();

        
    }
}