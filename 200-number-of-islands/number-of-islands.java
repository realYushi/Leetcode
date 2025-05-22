class Solution {
    public int numIslands(char[][] grid) {
        int num= 0;
        for(int r=0; r<grid.length;r++){
            for(int c=0; c<grid[0].length;c++){
                if(grid[r][c]=='1'){
                    num++;
                    bfs(grid,r,c);
                }
            }
        }
        return num;
    }
    private void bfs(char[][] grid, int r, int c){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]=='0'){
            return ;
        }
        grid[r][c]='0';
        for(int[] d:dirs){
            int nr=r+d[0];
            int nc=c+d[1];
            bfs(grid,nr,nc);
        }
        return;
    }
    int[][] dirs =new int[][]{
        {0,1},
        {0,-1},
        {1,0},
        {-1,0},
    };
}