class Solution {
    public int[] countBits(int n) {
        int[] res= new int[n+1];
        for(int i=0; i<=n; i++){
            int sum=0;
            int t= i;
            while(t!=0){
                t&=t-1;
                sum++;
            }
            res[i]=sum;
        }
        return res;
    

    }
}