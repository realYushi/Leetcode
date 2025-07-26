/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

// @lc code=start
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> q= new PriorityQueue<>((a,b)->(a[0]-b[0]));
        int [][] res= new int[k][2];
        for(int[]p :points){
            int d= p[0]*p[0]+p[1]*p[1];
            q.add(new int[]{d,p[0],p[1]});
        }
        for(int i=0; i<k; i++){
            int[] p= q.remove();
            res[i][0]=p[1];
            res[i][1]=p[2];
        }
        return res;
        
    }
}
// @lc code=end

