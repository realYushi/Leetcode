class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=0,min=0,sum=0;
        int gmax=nums[0],gmin=nums[0];
        for(int n:nums){
            sum+=n;
            max=Math.max(max+n,n);
            gmax=Math.max(max,gmax);
            min=Math.min(min+n,n);
            gmin=Math.min(min,gmin);
        }
        return gmax<0?gmax:Math.max(gmax,sum-gmin);


        
    }
}