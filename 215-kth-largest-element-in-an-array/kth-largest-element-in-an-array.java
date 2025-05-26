class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            q.add(n);
        }
        for(int i=1; i<k;i++){
            q.remove();
        }
        return q.peek();
        
    }
}