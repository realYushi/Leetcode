class Solution {
    public void dfs(List<List<Integer>> res, List<Integer> sub, int[] candidates,int i,int target){
        if(target==0){
            res.add(new ArrayList<>(sub));
            return; 
        }
        if(i>=candidates.length||target<0){
            return;
        }
        sub.add(candidates[i]);
        dfs(res,sub,candidates,i,target-candidates[i]);

        sub.remove(sub.size()-1);
        dfs(res,sub,candidates,i+1,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        dfs(res,sub,candidates,0,target);
        return res;
        
    }
}