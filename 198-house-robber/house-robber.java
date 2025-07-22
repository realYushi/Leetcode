class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp= new int[nums.length];
        Arrays.fill(dp,-1);
        return dfs(nums,0);
    }
    private int dfs(int[] nums, int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]= Math.max(nums[i]+dfs(nums,i+2),dfs(nums,i+1));
        return dp[i];
    }
}