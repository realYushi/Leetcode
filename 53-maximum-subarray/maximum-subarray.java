class Solution {
    public int maxSubArray(int[] nums) {
        int l=0;
        int res=nums[0];
        int sum=0;

        for(int n:nums){
            if(sum<0){
                sum=0;
            }
            sum+=n;
            res=Math.max(res,sum);
        }
        return res;
        
    }
}