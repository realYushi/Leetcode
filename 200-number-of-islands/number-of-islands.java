class Solution {
    public int numIslands(char[][] grid) {
        int ROWS=grid.length;
        int COLS=grid[0].length;
        int res=0;
        for(int r=0;r<ROWS;r++){
            for(int c=0; c<COLS; c++){
                if(grid[r][c]=='1'){
                    bsf(grid,r,c);
                    res++;
                }
            }
        }
        return res;
    }
    private int[][] dirs={
        {1,0},
        {-1,0},
        {0,1},
        {0,-1}
    };
    private void bsf(char[][] grid,int r, int c){
        Queue<int[]> q= new LinkedList<>();
        grid[r][c]='0';
        q.add(new int[]{r,c});
        while(!q.isEmpty()){
            int[] node =q.remove();
            int row=node[0];
            int col=node[1];
            for(int[] dir:this.dirs){
                int nr=row+dir[0];
                int nc=col+dir[1];
                if(nr<grid.length&&nc<grid[0].length&&
                nr>=0 && nc>=0 &&grid[nr][nc]=='1'){
                    q.add(new int[]{nr,nc});
                    grid[nr][nc]='0';
                }
            }

            
        }
    }
}