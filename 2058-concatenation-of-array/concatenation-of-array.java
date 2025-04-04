class Solution {
    public int[] getConcatenation(int[] nums) {
        int k=2;
        int[] res= new int[nums.length*k];
        for(int i=0; i<k;i++){
            for(int j=0;j<nums.length;j++){
                res[i*nums.length+j]=nums[j];
            }
        }
        
        return res;
    }
}