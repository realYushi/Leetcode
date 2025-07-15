class Solution {
    public void sortColors(int[] nums) {
        int[] bin = new int[3];
        for(int n:nums){
            bin[n]++;
        }
        int t=0;
        for(int i=0; i<bin.length; i++){
            while(bin[i]>0){
                nums[t]=i;
                bin[i]--;
                t++;
            }
        }
        
    }
}