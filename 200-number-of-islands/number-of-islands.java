class Solution {
    public int numIslands(char[][] grid) {
        int ROWS=grid.length;
        int COLS=grid[0].length;
        int res=0;
        for(int r=0;r<ROWS;r++){
            for(int c=0; c<COLS; c++){
                if(grid[r][c]=='1'){
                    bfs(grid,r,c);
                    res++;
                }
            }
        }
        return res;
    }
    private void bfs(char[][] grid, int r, int c){
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{r,c});
        while(!q.isEmpty()){
            int[] p= q.remove();
            int row=p[0];
            int col=p[1];
            for(int[] d:dirs){
                int nr=row+d[0];
                int nc=col+d[1];
                if(nr>=0&&nc>=0&&nr<grid.length&&nc<grid[0].length&&grid[nr][nc]=='1'){
                    q.add(new int[]{nr,nc});
                    grid[nr][nc]='0';
                }
            }
        }
        return;
    }
    private int[][] dirs= new int[][]{
        {1,0},
        {-1,0},
        {0,1},
        {0,-1}
    };
}