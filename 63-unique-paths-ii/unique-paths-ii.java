class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0){
            return 0;
        }
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1||obstacleGrid[row-1][col-1]==1){
            return 0;
        }
        dp=new int[row][col];
        dp[0][0]=1;
        for (int i = 1; i < row; i++) {
            if (obstacleGrid[i][0] == 0 && dp[i - 1][0] == 1) {
                dp[i][0] = 1;
            } else {
                dp[i][0] = 0;
            }
        }

        for (int j = 1; j < col; j++) {
            if (obstacleGrid[0][j] == 0 && dp[0][j - 1] == 1) {
                dp[0][j] = 1;
            } else {
                dp[0][j] = 0;
            }
        }
        for(int r=1; r<row; r++){
           for(int c=1; c<col; c++){
            dp[r][c]=dp[r-1][c]+dp[r][c-1];

            if(obstacleGrid[r][c]==1){
                dp[r][c]=0;
            }
           } 
        }
        return dp[row-1][col-1];
        
    }
}