class Solution {
    public int[] countBits(int n) {
        int[] res= new int[n+1];
        for(int i=0; i<=n; i++){
            int t=i;
            int r=0;
            while(t!=0){
                t&=t-1;
                r++;
            }
            res[i]=r;
        }
        return res;
        
    }
}