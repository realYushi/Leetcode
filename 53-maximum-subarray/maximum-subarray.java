class Solution {
    public int maxSubArray(int[] nums) {
        int max=0;
        int gmax=nums[0];
        for(int n:nums){
            if(max<0){
                max=0;
            }
            max+=n;
            gmax=Math.max(max,gmax);
        }
        return gmax;
        
    }
}