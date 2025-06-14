class Solution {
    public int orangesRotting(int[][] grid) {
        int freash =0;
        Queue<int[]> q= new LinkedList<>();
        for(int r=0; r<grid.length;r++){
            for(int c=0; c<grid[0].length;c++){
                if(grid[r][c]==1){
                    freash++;
                }
                if(grid[r][c]==2){
                    q.add(new int[]{r,c});
                }
            }
        }
        int[][] dir = new int[][]{
            {0,1},{0,-1},{1,0},{-1,0}
        };
        int turn=0;
        while(freash>0&&!q.isEmpty()){
            int len=q.size();
            for(int i=0; i<len; i++){
                int[] p=q.remove();
                for(int[] d:dir){
                    int nr=p[0]+d[0];
                    int nc=p[1]+d[1];
                    if(nr>=0&&nc>=0&&nr<grid.length&&nc<grid[0].length&&grid[nr][nc]==1){
                        freash--;
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            turn++;
        }
        return freash==0?turn:-1;
        
    }
}