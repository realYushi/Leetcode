class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones){
            q.add(n);
        }
        while(q.size()>1){
            int t= q.remove();
            if(q.peek()==t){
                q.remove();
            }else{
                q.add(t-q.remove());
            }
        }
        q.add(0);
        return q.peek();

        
    }
}