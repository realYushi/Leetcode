class Solution {
    public int removeElement(int[] nums, int val) {
        int l =0;
        for(int r=l; r<nums.length;r++){
            if(nums[r]!=val){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
        
    }
}