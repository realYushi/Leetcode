class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list= new LinkedList<>();
        List<Integer> sub= new LinkedList<>();
        dfs(list,sub,nums,0);
        return list;
    }
    private void dfs(List<List<Integer>> list,List<Integer> sub,int[] nums, int index){
        if(index>=nums.length){
            list.add(new LinkedList<>(sub));
            return;
        }
        sub.add(nums[index]);
        index++;
        dfs(list,sub,nums,index);
        sub.remove(sub.size()-1);
        dfs(list,sub,nums,index);

    }
}