class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new LinkedList<>();
        List<Integer> sub= new LinkedList<>();
        dfs(res,sub,candidates,target,0);
        return res;
        
    }
    private void dfs(List<List<Integer>> res, List<Integer>sub, int[] candidates, int target, int index){
        if(index>=candidates.length||target<0){
            return;
        }
        if(target==0){
            res.add(new LinkedList<>(sub));
            return;
        }
        sub.add(candidates[index]);
        dfs(res,sub,candidates,target-candidates[index],index);
        sub.remove(sub.size()-1);
        dfs(res,sub,candidates,target,index+1);
        return;

    }
}