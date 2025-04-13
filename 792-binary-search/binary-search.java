class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int m=-1;
        while(l<=r){
            m=l+(r-l)/2;
            if(target<nums[m]){
                r=m-1;
            }else if(target>nums[m]){
                l=m+1;
            }else{
                break;
            }
        }
        if(l>r){
            return -1;
        }
        return m;
        
    }
}