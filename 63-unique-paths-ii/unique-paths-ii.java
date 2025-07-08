class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n= obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        int [][]dp = new int[m][n];
        dp[0][0]=1;
        for(int i=1; i<m;i++){
            if(obstacleGrid[i][0]!=1){
                dp[i][0]=dp[i-1][0];
            }
        }
        for(int i=1; i<n;i++){
            if(obstacleGrid[0][i]!=1){
                dp[0][i]=dp[0][i-1];
            }
        }
        for(int r=1;r<m;r++){
            for(int c=1; c<n; c++){
                if(obstacleGrid[r][c]==1){
                    dp[r][c]=0;
                }else{

                dp[r][c]=dp[r-1][c]+dp[r][c-1];
                }
            }
        }
        return dp[m-1][n-1];
        

        
    }
}