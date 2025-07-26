class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> sub= new LinkedList<>();
        dfs(list,sub,candidates,target,0);
        return list;
    }
    private void dfs(List<List<Integer>> list, List<Integer> sub, int[] candidates, int target, int index){
        if(target<0||index>=candidates.length){
            return;
        }
        if(target==0){
            list.add(new LinkedList<>(sub));
            return;
        }
        sub.add(candidates[index]);
        dfs(list,sub,candidates,target-candidates[index],index);
        sub.remove(sub.size()-1);
        dfs(list,sub,candidates,target,index+1);


    }
        

}