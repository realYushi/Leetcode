class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        dfs(list,sub,candidates,target,0);
        return list;
    }
    private void dfs(List<List<Integer>>list, List<Integer> sub, int[]candidates, int target, int i){
        if(target==0){
            list.add(new ArrayList<>(sub)); 
            return;
        }
        if(i>candidates.length-1|| target<0){
            return;
        }
        sub.add(candidates[i]);
        dfs(list,sub,candidates,target-candidates[i],i);
        sub.remove(sub.size()-1);
        dfs(list,sub,candidates,target,i+1);

        
    }
}