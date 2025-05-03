class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
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