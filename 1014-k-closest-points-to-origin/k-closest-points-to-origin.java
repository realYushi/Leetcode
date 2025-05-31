class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> q=new PriorityQueue<>(Comparator.comparing(a->-a[0]));
        for(int[]p:points){
            int d=p[0]*p[0]+p[1]*p[1];
            q.add(new int[]{d,p[0],p[1]});
            if(q.size()>k){
                q.remove();
            }
        }
        
        int[][] res= new int[k][2];
        int len=q.size();
        for(int i=0; i<len; i++){
            int[] p=q.remove();
            res[i][0]=p[1];
            res[i][1]=p[2];
        }
        return res;
    }
}