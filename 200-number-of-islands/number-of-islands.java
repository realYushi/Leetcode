class Solution {
    public int numIslands(char[][] grid) {
        int ROWS=grid.length;
        int COLS= grid[0].length;
        int i=0;
        for(int r=0;r<ROWS;r++){
            for(int c=0; c<COLS;c++){
                if(grid[r][c]=='1'){
                    dfs(grid,r,c);
                    i++;
                }
            }
        }
        return i;
    }
    private void dfs(char[][] grid,int r, int c){
        if(r<0||c<0 || r>=grid.length||c>=grid[0].length || grid[r][c]=='0'){
            return; 
        }
        for(int[] d:dirs){
            grid[r][c]='0';
            dfs(grid,r+d[0],c+d[1]);
        }
        return;
    }
    private int[][] dirs=new int[][]{
        {0,1},
        {0,-1},
        {1,0},
        {-1,0},
    };
}