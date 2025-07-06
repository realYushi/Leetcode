class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int min=0, max=0, sum=0;
        int gmin=nums[0], gmax=nums[0];
        for(int n:nums){
            sum+=n;
            max=Math.max(n,max+n);
            gmax=Math.max(gmax,max);
            min=Math.min(n,min+n);
            gmin=Math.min(gmin,min);
        }
        return gmax<0?gmax:Math.max(gmax,sum-gmin);
        
    }
}