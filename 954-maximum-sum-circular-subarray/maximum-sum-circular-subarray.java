class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int gmin=nums[0], gmax=nums[0];
        int max=0, min=0,t=0;
        for(int n:nums){
            t+=n;
            max=Math.max(max+n,n);
            gmax=Math.max(gmax,max);
            min=Math.min(min+n,n);
            gmin=Math.min(gmin,min);
        }
        return gmax<0?gmax:Math.max(gmax,t-gmin);
        
    }
}