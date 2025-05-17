class Solution {
    public int numIslands(char[][] grid) {
        int ROWS=grid.length;
        int COLS=grid[0].length;
        int number=0;
        for(int r=0; r<ROWS; r++){
            for(int c=0;c<COLS;c++){
                if(grid[r][c]=='1'){
                    dfs(grid,r,c);
                    number++;
                }
            }
        }
        return number;
    }
    private void dfs(char[][] grid, int r, int c){
        if(r<0||c<0||r>=grid.length||c >=grid[0].length||grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        for(int[] d:dir){
            dfs(grid,r+d[0],c+d[1]);
        }
        return;
    }
    private int[][] dir= new int[][]{
        {0,1},{0,-1},{1,0},{-1,0}
    };
}