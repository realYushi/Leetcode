/*
 * @lc app=leetcode id=1343 lang=java
 *
 * [1343] Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 */

// @lc code=start
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int sum=0;
        int res=0;
        for(int r=0; r<arr.length; r++){
            sum+=arr[r];
            if(r-l+1==k){
                if(sum/k>=threshold){
                    res++;
                }
                sum-=arr[l];
                l++;
            }
        }
        return res;
    }
}
// @lc code=end

