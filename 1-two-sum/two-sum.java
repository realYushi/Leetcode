class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        boolean done=false;
        int arr[]=new int[2];
        for (int i =0;i < len-1; i++){
            if(done){
                break;
            }
            for(int k=i+1; k<len;k++){
                if(nums[i]+nums[k]==target){
                    done=true;
                    arr[0]=i;
                    arr[1]=k;
                    break;
                }




            }
        }
        return arr; 


        
    }
}