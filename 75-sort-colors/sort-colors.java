class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==1){
            return;
        }
        int[] bin= new int[]{0,0,0};
        for(int n:nums){
            bin[n]++;
        }
        int k= 0;
        for(int i=0; i<bin.length; i++){
            while(bin[i]>0){
                nums[k]=i;
                k++;
                bin[i]--;
            }
        }

        
    }
}