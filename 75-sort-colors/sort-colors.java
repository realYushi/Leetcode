class Solution {
    public void sortColors(int[] nums) {
        int[] bucket=new int[]{0,0,0};
        for(int n:nums){
            bucket[n]++;
        }
        int index=0;
        for(int k=0; k<bucket.length;k++){
            while(bucket[k]>0){
                nums[index]=k;
                index++;
                bucket[k]--;
            }
        }
        }
}
