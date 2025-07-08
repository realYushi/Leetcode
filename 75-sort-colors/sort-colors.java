class Solution {
    public void sortColors(int[] nums) {
        int[] bin= new int[3];
        for(int c:nums){
            bin[c]++;
        }
        int t=0;
        for(int i=0; i<bin.length; i++){
            while(bin[i]>0){
                bin[i]--;
                nums[t]=i;
                t++;
            }
        }
        return;
        
    }
}