class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int gmax=nums[0], gmin=nums[0];
        int max=0, min=0, sum=0;
        for(int n:nums){
            sum+=n;
            max=Math.max(n,max+n);
            gmax=Math.max(max,gmax);
            min=Math.min(n,min+n);
            gmin=Math.min(min,gmin);
        }
        return gmax<0?gmax:Math.max(gmax,sum-gmin);
        
    }
}