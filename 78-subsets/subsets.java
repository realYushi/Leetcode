class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        dsf(res,sub,nums,0);
        return res;
    }
    private void dsf(List<List<Integer>> res, List<Integer> sub, int[] nums, int i){
        if(i==nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[i]);
        dsf(res,sub,nums,i+1);

        sub.remove(sub.size()-1);
        dsf(res,sub,nums,i+1);

    }
}