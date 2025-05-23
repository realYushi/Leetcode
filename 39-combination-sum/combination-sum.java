class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        dfs(candidates,list,sub,target,0);
        return list;
    }
    private void dfs(int[] candidates, List<List<Integer>>list, List<Integer>sub, int target, int index ){
        if(target==0){
            list.add(new ArrayList<>(sub));
            return;
        }
        if(index>=candidates.length||target<0){
            return;
        }
        sub.add(candidates[index]);
        dfs(candidates,list,sub,target-candidates[index],index);
        sub.remove(sub.size()-1);
        dfs(candidates,list,sub,target,index+1);
    }
}