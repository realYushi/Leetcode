class Solution {
    private void dfs(List<List<Integer>> res, List<Integer> sub, int[] nums, int index){
        if(index==nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[index]);
        dfs(res,sub,nums,index+1);
        sub.remove(sub.size()-1);
        dfs(res,sub,nums,index+1);
        return;

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        dfs(res,sub,nums,0);
        return res;
    }
}