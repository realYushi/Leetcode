class Solution {
    public int[] getConcatenation(int[] nums) {
        int k=2;
        int len=nums.length;
        int[] res= new int[len*k];
        for(int l=0;l<k;l++){
            for(int r=0;r<nums.length; r++){
                res[l*len+r]=nums[r];
            }
        }
        return res;
        
    }
}