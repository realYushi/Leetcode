/*
 * @lc app=leetcode id=918 lang=java
 *
 * [918] Maximum Sum Circular Subarray
 */

// @lc code=start
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int min=0;
        int max=0;
        int gmax=nums[0];
        int gmin=nums[0];
        int sum=0;
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
// @lc code=end

