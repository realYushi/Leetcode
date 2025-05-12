class Solution {
    public void dfs(List<List<Integer>> res, List<Integer> sub, int i, int[] nums){
        if(i>=nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[i]);
        dfs(res,sub,i+1,nums);

        sub.remove(sub.size()-1);
        dfs(res,sub,i+1,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        dfs(res,sub,0,nums);
        return res;

        
    }
}