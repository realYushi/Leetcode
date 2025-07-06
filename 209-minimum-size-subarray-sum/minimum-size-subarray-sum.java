class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int sum=0;
        int res=nums.length+1;
        for(int r=0; r<nums.length; r++){
            sum+=nums[r];
            while(sum>=target){
                res=Math.min(res,r-l+1);
                sum-=nums[l];
                l++;
            }


        }
        return res==nums.length+1?0:res;
        
    }
}