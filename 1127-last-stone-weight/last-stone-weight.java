class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        for(int s:stones) {
            q.add(s);
        }
        while(q.size()>1){
            int s=q.remove();
            if(s==q.peek()){
                q.remove();
            }else{
                q.add(s-q.remove());
            }
        }
        q.add(0);
        return q.peek();
    }
}