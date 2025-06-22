class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return dsf(nums,0);
    }
    private int dsf(int[] nums, int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=Math.max(nums[i]+dsf(nums,i+2),dsf(nums,i+1));
        return dp[i];

    }
}