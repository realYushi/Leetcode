class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int r=0; r<grid.length ; r++){
            for(int c=0; c<grid[0].length; c++){
                if(grid[r][c]==1){
                    max=Math.max(max,dfs(grid,r,c));
                }
            }
        }
        return max;
    }
    private int[][] dirs=new int[][]{
        {0,1},{0,-1},{1,0},{-1,0}
    };
    private int dfs(int[][] grid, int r, int c){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0){
            return 0;
        }
        int area=1;
        grid[r][c]=0;
        for(int d[]:dirs){
            area+=dfs(grid,r+d[0],c+d[1]);
        }
        return area;

    }
}