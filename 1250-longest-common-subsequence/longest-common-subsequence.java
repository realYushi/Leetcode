class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m+1][n+1];
        for(int j=1; j<=m;j++){
            for(int k=1; k<=n;k++){
                if(text1.charAt(j-1)==text2.charAt(k-1)){
                    dp[j][k]=1+dp[j-1][k-1];
                }else{
                    dp[j][k]=Math.max(dp[j-1][k],dp[j][k-1]);
                }
            }
        }
        return dp[m][n];
        
    }
}