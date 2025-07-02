class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null){
            return 0;
        }
        int m=obstacleGrid.length;
        int n= obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1){
            return 0;
        }

        int [][]pd= new int [m][n];
        pd[0][0]=1;
        for( int i=1; i<m; i++){
            if(obstacleGrid[i][0]!=1){
                pd[i][0]=pd[i-1][0];
            }
        }
        for( int i=1; i<n; i++){
            if(obstacleGrid[0][i]!=1){
                pd[0][i]=pd[0][i-1];
            }
        }
        for(int r=1; r<m; r++){
            for( int c=1; c<n; c++){
                if(obstacleGrid[r][c]==1){
                    pd[r][c]=0;
                }else{
                    pd[r][c]=pd[r-1][c]+pd[r][c-1];
                }
            }
        }
        return pd[m-1][n-1];
    }
}