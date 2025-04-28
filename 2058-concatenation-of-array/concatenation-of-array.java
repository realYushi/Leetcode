class Solution {
    public int[] getConcatenation(int[] nums) {
        int time=2;
        int[] res=new int[time*nums.length];
        for(int j=0;j<time;j++){
            for(int k=0;k<nums.length;k++){
                res[k+j*nums.length]=nums[k];
            }
        }
        return res;
        
    }
}