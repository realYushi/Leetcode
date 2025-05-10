class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            q.add(i);
        }
        while(1<q.size()){
            int t= q.remove();
            if(t==q.peek()){
                q.remove();
            }else{
                q.add(t-q.remove());
            }
        }
        q.add(0);
        return q.peek();
        
    }
}