/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

// @lc code=start
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res= new int[k][2];
        Queue<int[]> q = new PriorityQueue<>((o1,o2)->Integer.compare(o1[0],o2[0]));
        for(int[] p:points){
            int t= p[0]*p[0]+p[1]*p[1];
            q.add(new int[]{t,p[0],p[1]});
        }
        for(int i=0; i<k; i++){
            int [] t= q.remove();
            res[i][0]=t[1];
            res[i][1]=t[2];
        }
        return res;
    }
}
// @lc code=end

