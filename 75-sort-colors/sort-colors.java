class Solution {
    public void sortColors(int[] nums) {
        int[] bucket=new int[]{0,0,0};
        for(int i=0; i<nums.length;i++){
            bucket[nums[i]]++;
        }
        int j=0;
        for(int i=0; i< bucket.length;i++){
            while(bucket[i]>0){
                nums[j]=i;
                j++;
                bucket[i]--;
            }
        }
        
    }
}