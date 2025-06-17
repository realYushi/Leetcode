class Solution {
    int[] cache;
    public int climbStairs(int n) {
        this.cache=new int[n+1];
        for(int i=0; i<=n; i++){
            cache[i]=-1;
        }
        return dfs(n);
    }
    private int dfs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(cache[n]!=-1){
            return cache[n];
        }
        return cache[n]=dfs(n-1)+dfs(n-2);
    }
}