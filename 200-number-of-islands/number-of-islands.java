class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
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
        grid[r][c]='0';
        q.add(new int[]{r,c});
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0; i<len; i++){
                int[] p=q.remove();
                for(int[] d:dirs){
                    int nr=p[0]+d[0];
                    int nc=p[1]+d[1];
                    if(nr>=0&&nc>=0&&nr<grid.length&&nc<grid[0].length&&grid[nr][nc]=='1'){
                        q.add(new int[]{nr,nc});
                        grid[nr][nc]='0';
                    }
                }
            }
        }
        return;
    }
    private int[][] dirs=new int[][]{
        {0,1},{0,-1},
        {1,0},{-1,0},
    };
}