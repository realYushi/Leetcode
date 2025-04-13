class Solution {
    public void sortColors(int[] nums) {
        int[] bucket=new int[]{0,0,0};
        for(int i:nums){
            bucket[i]++;
        }
            int j=0;
        for(int i=0; i<bucket.length; i++){
            int k=bucket[i];
            while(k>0){
                nums[j]=i;
                j++;
                k--;
            }
        }
        
    }
}