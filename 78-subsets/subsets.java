class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        List<Integer> sub = new LinkedList<>();
        dfs(res,sub,nums,0);
        return res;
    }
    private void dfs(List<List<Integer>> res, List<Integer> sub, int[] nums, int index){
        if(index>=nums.length){
            res.add(new LinkedList<>(sub));
            return ;
        }
        sub.add(nums[index]);
        index++;
        dfs(res,sub,nums,index);
        sub.remove(sub.size()-1);
        dfs(res,sub,nums,index);
    }
}