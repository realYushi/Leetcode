class Solution {
    public void sortColors(int[] nums) {
        int[] bucket=new int[]{0,0,0};
        for(int c:nums){
            bucket[c]++;
        }
        int k=0;
        for( int i=0; i<bucket.length; i++){
            while(bucket[i]>0){
                nums[k]=i;
                bucket[i]--;
                k++;
            }
        }
        
        return;
    }
}