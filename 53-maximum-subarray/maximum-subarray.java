class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int sum=0;
        for(int n:nums){
            sum=Math.max(n, sum+n);
            res=Math.max(res,sum);
        }
        return res;
    }
}