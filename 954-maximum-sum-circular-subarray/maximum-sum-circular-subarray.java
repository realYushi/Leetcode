class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int gmax=nums[0], gmin=nums[0];
        int min=0, max=0,t=0;
        for(int n:nums){
            t+=n;
            min=Math.min(min+n,n);
            gmin=Math.min(min,gmin);
            max=Math.max(max+n,n);
            gmax=Math.max(max,gmax);
        }
        return gmax<0?gmax:Math.max(gmax,t-gmin); 

        
    }
}