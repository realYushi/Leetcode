class Solution {
    public void sortColors(int[] nums) {
        int[] bin= new int[3]; 
        for(int c:nums){
            bin[c]++;
        }
        int l=0;
        for(int i=0; i<bin.length;i++){
            while(bin[i]>0){
                nums[l]=i;
                bin[i]--;
                l++;
            }
        }
        
    }
}