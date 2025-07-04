class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int gmax=nums[0],gmin=nums[0];
        int min=0,max=0,t=0;
        for(int n:nums){
            t+=n;
            min=Math.min(n,min+n);
            gmin=Math.min(gmin,min);
            max=Math.max(n,max+n);
            gmax=Math.max(gmax,max);
        }
        return gmax<0?gmax:Math.max(gmax,t-gmin);
        
    }
}