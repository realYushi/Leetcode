class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans={0,0};
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int l = 0; l < nums.length; l++){
            int n = target - nums[l];
            if(map.containsKey(n)){
                ans[0]=l;
                ans[1]=map.get(n);
                break;
            }else{
                map.put(nums[l],l);
            }

        }
        return ans;
        
    }
}