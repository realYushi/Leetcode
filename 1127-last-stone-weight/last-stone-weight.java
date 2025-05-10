class Solution {
    public int lastStoneWeight(int[] stones) {      
        if(stones.length==1){
            return stones[0];
        }
        Queue<Integer> q= new PriorityQueue(Collections.reverseOrder());
        for(int s:stones){
            q.add(s);
        }
        int t=0;
        while(q.size()>1){
            t=q.remove();
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