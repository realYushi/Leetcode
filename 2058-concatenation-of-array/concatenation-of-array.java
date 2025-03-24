class Solution {
    public int[] getConcatenation(int[] nums) {
        int length= nums.length;
        int[] ans=new int[length*2];
        int k = 2;
        for(int i = 0; i<k;i++) {
            for(int j = 0; j < length; j++){
                ans[j+i*length]=nums[j];

            }
        }
        return ans;
        
    }
}