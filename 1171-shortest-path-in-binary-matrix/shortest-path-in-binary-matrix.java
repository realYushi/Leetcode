class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1||grid[n-1][n-1]==1){
            return -1;
        }
        if(n==1){
            return 1;
        }
        return bfs(grid,0,0);
    }
    private int bfs(int[][] grid,int r, int c){
        int n= grid.length;
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{0,0});
        grid[0][0]=1;
        int p=1;
        while(!q.isEmpty()){
            int len =q.size();
            for(int i=0; i<len; i++){
                int[] cell=q.remove();
                if(cell[0]==n-1&&cell[1]==n-1){
                    return p;
                }
                for(int[] d:dirs){
                    int nr=cell[0]+d[0];
                    int nc=cell[1]+d[1];
                    if(nr>=0&&nc>=0 && nr<n&&nc<n && grid[nr][nc]==0){
                        grid[nr][nc]=1;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            p++;
        }
        return -1;
    }
    private int[][] dirs= new int[][]{
        {0,1},{0,-1},{1,0},{-1,0},
        {1,1},{1,-1},{-1,1},{-1,-1},
    };

    
}