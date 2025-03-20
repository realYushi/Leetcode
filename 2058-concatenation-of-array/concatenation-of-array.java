class Solution {
    public int[] getConcatenation(int[] nums) {
        int len= nums.length;
        int[] newNums=new int[len*2];
        for(int i = 0; i < 2; i ++){
            for(int j = 0; j<len; j++){
                newNums[j+(i*len)]=nums[j];
            }
        }
        return newNums;
    
    }
}