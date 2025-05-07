class Solution {
    public void dfs( List<List<Integer>> res, List<Integer> sub,int[] candidates, int target,int i){
        if(target==0){
        res.add(new ArrayList<>(sub));
        return;
        }
        if(target<0||i>=candidates.length){
            return;
        }


        sub.add(candidates[i]);
        dfs(res,sub,candidates,target-candidates[i],i);
        sub.remove(sub.size()-1);
        dfs(res,sub,candidates,target,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        dfs(res,sub,candidates,target,0);
        return res;
        
    }
}
