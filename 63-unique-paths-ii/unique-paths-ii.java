class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null){
            return 0;
        }
        int m=obstacleGrid.length;
        int n= obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        int[][]dp=new int[m][n];
        dp[0][0]=1;

        for( int i=1; i<m;i++ ){
            if(obstacleGrid[i][0]!=1){
                dp[i][0]=dp[i-1][0];
            }
        }
        for( int i=1; i<n;i++ ){
            if(obstacleGrid[0][i]!=1){
                dp[0][i]=dp[0][i-1];
            }
        }
        for(int j=1; j<m;j++){
            for(int k=1; k<n; k++){
                if(obstacleGrid[j][k]==1){
                    dp[j][k]=0;
                }else{
                    dp[j][k]=dp[j-1][k]+dp[j][k-1];
                }
            }
        }
        return dp[m-1][n-1];
        
    }
}
        