class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]={0,0};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length;i++){
                int key=target-nums[i];
            if(map.containsKey(key)){
                ans[0]=i;
                ans[1]=map.get(key);
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
        
    }
}