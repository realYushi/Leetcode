/*
 * @lc app=leetcode id=1700 lang=java
 *
 * [1700] Number of Students Unable to Eat Lunch
 */

// @lc code=start
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q= new LinkedList<>();
        for(int s:students){
            q.add(s);
        }
        int eaten=0;
        for(int s:sandwiches){
            int len= q.size();
            int att=0;
            while(att!=len){
                if(q.peek()==s){
                    q.remove();
                    eaten++;
                    break;
                }else{
                    q.add(q.remove());
                    att++;
                }
            }
            if(att==len){
                break;
            }
        }
        return sandwiches.length-eaten;
    }
}
// @lc code=end

