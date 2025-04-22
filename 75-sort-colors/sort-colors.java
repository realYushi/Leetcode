class Solution {
    public void sortColors(int[] nums) {
        int[] bucket=new int[]{0,0,0};
        for(int c:nums){
            bucket[c]++;
        }
        int i=0;
        for(int j=0; j<bucket.length;j++){
            while(bucket[j]>0){
                nums[i]=j;
                i++;
                bucket[j]--;
            }
        }
        
    }
}