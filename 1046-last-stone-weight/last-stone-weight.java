/*
 * @lc app=leetcode id=1046 lang=java
 *
 * [1046] Last Stone Weight
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q= new PriorityQueue<>((a,b)->b-a);
        for(int i:stones){
            q.add(i);
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
// @lc code=end

