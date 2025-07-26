class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list= new LinkedList<>();
        List<Integer> sub= new LinkedList<>();
        dfs(list,sub,nums,0);
        return list;
    }
    private void dfs(List<List<Integer>> list, List<Integer> sub, int[] nums, int i){
        if(nums==null || i>nums.length){
            return;
        }
        if(i==nums.length){
            list.add(new LinkedList(sub));
            return;
        }
        sub.add(nums[i]);
        
        dfs(list,sub,nums,i+1);
        sub.remove(sub.size()-1);
        dfs(list,sub,nums,i+1);
        return;

    }

}