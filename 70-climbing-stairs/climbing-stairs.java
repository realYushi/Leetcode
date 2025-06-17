class Solution {
    Map<Integer, Integer> cache= new HashMap<>();
    public int climbStairs(int n) {
        return dfs(n);
    }
    private int dfs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        int result=dfs(n-1)+dfs(n-2);
        cache.put(n,result);
        return cache.get(n);
    }
}