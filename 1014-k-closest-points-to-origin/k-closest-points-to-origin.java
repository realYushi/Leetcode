class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int[] p:points){
            int d=p[0]*p[0]+p[1]*p[1];
            q.add(new int[]{d,p[0],p[1]});
        }
        int[][] res=new int[k][2];
        for(int i=0; i<k;i++){
            int[] t= q.remove();
            res[i][0]=t[1];
            res[i][1]=t[2];
        }
        return res;
        
        
    }
}