/*
 * @lc app=leetcode id=978 lang=java
 *
 * [978] Longest Turbulent Subarray
 */

// @lc code=start
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int inc=1;
        int dec=1;
        int res=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]<arr[i]){
                inc=dec+1;
                dec=1;
            }else if(arr[i-1]>arr[i]){
                dec=inc+1;
                inc=1;
            }else{
                inc=1;
                dec=1;
            }
            res=Math.max(res, Math.max(inc,dec));
        }
        return res;
    }
}
// @lc code=end

