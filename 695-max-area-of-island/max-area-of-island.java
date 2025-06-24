class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                if(grid[r][c]==1){
                res=Math.max(res,dfs(grid, r,c));
                }
            }
        }
        return res;
    }
    private int[][] dirs=new int[][]{
        {0,1},{0,-1},{1,0},{-1,0},
    };
    private int dfs(int[][] grid, int r, int c){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0){
            return 0;
        }
        int res=0;
        grid[r][c]=0;
        res++;
        for(int[] d:dirs){
            res+=dfs(grid,r+d[0],c+d[1]);
        }
        return res;
    }
}