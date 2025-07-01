class Solution {
    Queue<Integer> q;
    public int findKthLargest(int[] nums, int k) {
        q=new PriorityQueue<>();
        for(int n:nums){
            q.add(n);
            if(q.size()>k){
                q.remove();
            }
        }
        return q.peek();
        

        
    }
}