class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap <>();
        int[] res= new int[]{0,0};
        for(int i=0; i<nums.length;i++){
            int key=target-nums[i];
            if(map.containsKey(key)){
                res[0]=i;
                res[1]=map.get(key);
            }else{
                map.put(nums[i],i);
            }
                
        }
        return res;
        
    }
}