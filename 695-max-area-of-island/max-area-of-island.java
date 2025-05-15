class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS=grid.length;
        int COLS= grid[0].length;
        Queue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        for(int r=0; r<ROWS; r++){
            for(int c=0; c<COLS; c++){
                if(grid[r][c]==1){
                    q.add(bfs(grid,r,c));
                }
            }
        }
        q.add(0);
        return q.peek();
    }
    public int bfs(int[][] grid, int r, int c){
        Queue<int[]> q=new LinkedList<>();
        int area=1;
        q.add(new int[]{r,c});
        grid[r][c]=0;
        while(!q.isEmpty()){
            int[] p= q.remove();
            for(int[] d: dirs){
                int nr= p[0]+d[0];
                int nc= p[1]+d[1];
                if(nr>=0&&nc>=0 && nr<grid.length&&nc<grid[0].length && grid[nr][nc]==1){
                    q.add(new int[]{nr,nc});
                    grid[nr][nc]= 0;
                    area++;
                }
            }
        }
        return area;
    }
    private int[][] dirs= new int[][]{
        {1,0},
        {-1,0},
        {0,1},
        {0,-1}
    };
}