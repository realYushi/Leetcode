class Solution {
    public int orangesRotting(int[][] grid) {
        int ROWS=grid.length;
        int COLS=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int time=0;
        int fresh=0;
        for(int r= 0; r<ROWS; r++){
            for(int c=0; c<COLS;c++){
                if(grid[r][c]==1){
                    fresh++;
                }
                if(grid[r][c]==2){
                    q.add(new int[]{r,c});
                }
            }
        }
        int[][] dirs= new int[][]{
            {0,1}, {0,-1},{1,0},{-1,0}
        };
        while(fresh>0 && !q.isEmpty()){
            int len=q.size();
            for(int i=0; i<len; i++){
                int p[]=q.remove();
                for(int d[]:dirs){
                    int nr=p[0]+d[0];
                    int nc=p[1]+d[1];
                    if(nr>=0&&nc>=0&&nr<grid.length&&nc<grid[0].length&&grid[nr][nc]==1){
                        q.add(new int[]{nr,nc});
                        grid[nr][nc]=2;
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh==0?time:-1;


        
    }
}