class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int gsum=nums[0];
        for(int n:nums){
            if(sum<0){
                sum=0;
            }
            sum+=n;
            gsum=Math.max(gsum,sum);
        }
        return gsum;

        
    }
}