class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        dfs(list, sub, nums, 0);
        return list;
    }

    private List<List<Integer>> dfs(List<List<Integer>> list, List<Integer> sub, int[] nums, int i) {
        if(i>=nums.length){
            list.add(new ArrayList<>(sub));
            return list;
        }
        sub.add(nums[i]);
        dfs(list,sub,nums,i+1);

        sub.remove(sub.size()-1);
        dfs(list,sub,nums,i+1);

        return list;


    }

}