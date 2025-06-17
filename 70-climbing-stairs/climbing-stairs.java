class Solution {
    Map<Integer,Integer> map= new HashMap<>();
    public int climbStairs(int n) {
       return dfs(n); 
    }
    private int dfs(int n){
        if(n<=2){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int res= dfs(n-1)+dfs(n-2);
        map.put(n,res);
        return res;
    }
}