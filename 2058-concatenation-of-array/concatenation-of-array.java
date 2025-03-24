class Solution {
    public int[] getConcatenation(int[] nums) {
        int k = 2;
        int length=nums.length;
        int[] ans = new int[length*2];
        for(int i = 0;i<k;i++){
            for(int j =0; j<length;j++){
                ans[i*length+j]=nums[j];
            }
        }
        return ans;
        
    }
}