class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int k=len*2;
        int[] res= new int[k];
        for(int l=0;l<2;l++){
            for(int r=0;r<nums.length; r++){
                res[l*len+r]=nums[r];
            }
        }
        return res;
        
    }
}