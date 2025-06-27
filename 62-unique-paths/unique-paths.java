class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        return dfs(m,n);
    }
    private int dfs(int m, int n){
        for(int i=0; i<m; i++){
            dp[i][0]=1;
        }
        for(int i=0; i<n; i++){
            dp[0][i]=1;
        }
        for(int j=1; j<m;j++){
            for(int k=1; k<n; k++){
                dp[j][k]=dp[j-1][k]+dp[j][k-1];
            }
        }
        return dp[m-1][n-1];
    }
}