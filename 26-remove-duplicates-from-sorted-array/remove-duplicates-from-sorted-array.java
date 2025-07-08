class Solution {
    public int removeDuplicates(int[] nums){
        int l=0;
        for(int n:nums){
            if(n!=nums[l]){
                l++;
                nums[l]=n;
            }
        }
        return l+1;
        
    }
}