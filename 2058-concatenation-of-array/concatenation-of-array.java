class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] ans=new int[len *2];
        int TIME= 2;
        for(int i = 0;i<TIME;i++){
            for(int j = 0 ; j<len;j++){
                ans[j+i*len]=nums[j];
            }
        }
        return ans;
        
    }
}