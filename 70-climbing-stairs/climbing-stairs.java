class Solution {
    int[] pd;
    public int climbStairs(int n) {
        pd=new int[n+1];
        Arrays.fill(pd,-1);
        return dfs(n);
    }
    private int dfs(int n){
        if(n<=2){
            return n;
        }
        if(pd[n]!=-1){
            return pd[n];
        }
        pd[n]=dfs(n-1)+dfs(n-2);
        return pd[n];

        
            
    }
}