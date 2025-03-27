class Solution {
    public int[] getConcatenation(int[] nums) {
        int k =2;
        int len = nums.length;
        int[] arr= new int[len*2];
        for(int i = 0; i < k ; i++){
            for(int j = 0;j<len; j++ ){
                arr[i*len+j]=nums[j];
            }
        }
        return arr;
        
    }
}