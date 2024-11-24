class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result []={0,0};
        for(int i = 0; i<nums.length+1;i++){
            for(int j =i+1; j<nums.length;j++){
                if((nums[i]+nums[j])!=target){
                    continue;
                }else{
                result[0]=i;
                result[1]=j;
                break;
                }
            }
            if(result[0]!=0){
                break;
            }


        }
        return result;
        
    }
}