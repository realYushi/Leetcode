class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        if(grid[0][0]==1||grid[rows-1][cols-1]==1){
            return -1;

        }
        if(rows==1 && cols==1){
            return  1;
        }
        return bfs(grid,0,0);
    }
    private int bfs(int[][] grid, int r, int c){
        Queue<int[]> q= new LinkedList<>();
        int res=0;
        q.add(new int[]{r,c});
        grid[r][c]=1;
        res++;
        int[][] dirs= new int[][]{
            {0,1},{0,-1},{1,0},{-1,0},
            {1,1},{1,-1},{-1,-1},{-1,1},
        };
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0; i<len;i++){
                int[] p= q.remove();
                if(p[0]==grid.length-1&&p[1]==grid[0].length-1){
                    return res;
                }
                for(int[] d:dirs){
                    int nr= p[0]+d[0];
                    int nc= p[1]+d[1];
                    if(nr>=0&&nc>=0 && nr<grid.length&&nc<grid[0].length&& grid[nr][nc]==0){
                        q.add(new int[]{nr,nc});
                        grid[nr][nc]=1;
                    }
                }
            }

            res++;
        }
        return -1;
    }
}