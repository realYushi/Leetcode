class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int t=0;
        int gmax=nums[0];
        int gmin=nums[0];
        int max=0;
        int min=0;
        for(int n:nums){
            t+=n;
            max=Math.max(max+n,n);
            gmax=Math.max(max,gmax);
            min=Math.min(min+n,n);
            gmin=Math.min(min,gmin);
        }
        return gmax>0?Math.max(t-gmin,gmax):gmax; 
        
    }
}