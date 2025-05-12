class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q= new PriorityQueue<>();
        for(int n:nums){
            q.add(n);
            if(k<q.size()){
                q.remove();
            }
        }
        return q.peek();
        
    }
}