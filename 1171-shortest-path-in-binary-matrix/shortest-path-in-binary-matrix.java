class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int ROWS=grid.length;
        int COLS=grid[0].length;
        if(grid[0][0]==1 || grid[ROWS-1][COLS-1]==1){
            return -1;
        }
        if(ROWS==1&&COLS==1){
            return 1;
        }
        return bfs(grid,0,0);
    }
    private int bfs(int[][] grid, int r, int c){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        int res =1;
        grid[r][c]='1';
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0; i<len; i++){
                int[] cell = q.remove();
                if(cell[0]==grid.length-1 && cell[1]==grid[0].length-1){
                    return res;
                }

                for(int d[]:dirs){
                    int nr= cell[0]+d[0];
                    int nc= cell[1]+d[1];
                    if(nr>=0&&nc>=0 && nr<grid.length&&nc<grid[0].length && grid[nr][nc]==0){
                        q.add(new int[]{nr,nc});
                        grid[nr][nc]=1;
                    }
                }
            }
            res++;
        }
        return -1;
    }
    private int[][] dirs=new int[][]{
        {0,1},{0,-1},{1,0},{-1,0},
        {1,1},{1,-1},{-1,1},{-1,-1},
    };
    
}