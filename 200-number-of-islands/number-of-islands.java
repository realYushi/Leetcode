class Solution {
    public int numIslands(char[][] grid) {
        int ROWS=grid.length;
        int COLS= grid[0].length;
        int res=0;
        for(int r=0; r<ROWS;r++){
            for(int c=0;c<COLS;c++){
                if(grid[r][c]=='1'){
                    res++;
                    bfs(grid,r,c);
                }
            }
        }
        return res;
    }
    private void bfs(char[][] grid, int r, int c){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        grid[r][c]='0';
        while(!q.isEmpty()){
            int[] p=q.remove();
            for(int d[]:dirs){
                int nr=p[0]+d[0];
                int nc=p[1]+d[1];
                if(nr>=0&&nc>=0){
                    if(nr<grid.length&&nc<grid[0].length){
                        if(grid[nr][nc]=='1'){
                            q.add(new int[]{nr,nc});
                            grid[nr][nc]='0';
                        }
                    }
                }
            }
        }
        return;
    }
    private int[][] dirs=new int[][]{
        {1,0},
        {-1,0},
        {0,1},
        {0,-1},
    };
}