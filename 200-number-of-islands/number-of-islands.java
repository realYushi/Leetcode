class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length;c++){
                if(grid[r][c]=='1'){
                    res++;
                    dfs(grid,r,c);
                }
            }
        }
        return res;
    }
    private void dfs(char[][] gird, int r, int c){
        if(r<0||c<0||r>=gird.length||c>=gird[0].length||gird[r][c]=='0'){
            return;
        }
        gird[r][c]='0';
        for(int[] d:dirs){
            dfs(gird,r+d[0],c+d[1]);
        }
        return;
    }
    private int[][] dirs= new int[][]{
        {0,1},{0,-1},{1,0},{-1,0}
    };
}