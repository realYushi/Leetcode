/*
 * @lc app=leetcode id=1143 lang=java
 *
 * [1143] Longest Common Subsequence
 */

// @lc code=start
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m= text1.length();
        int n= text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int r=0; r<m; r++){
            for(int c=0; c<n; c++){
                if(text1.charAt(r)==text2.charAt(c)){
                    dp[r+1][c+1]=dp[r][c]+1; 
                }else{
                    dp[r+1][c+1]=Math.max(dp[r+1][c],dp[r][c+1]);
                }

            }
        }
        return dp[m][n];
        
    }
}
// @lc code=end

