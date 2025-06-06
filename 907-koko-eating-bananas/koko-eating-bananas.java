class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int n:piles){
            r=Math.max(r,n);
        }
        int res=0;
        while(l<=r){
            int m=l+(r-l)/2;
            int time=eating(piles,m);
            if(h<time){
                l=m+1;  
            }else{
                res=m;
                r=m-1;
            }
        }
        return res;
    }
    private int eating(int[] piles, int n){
        int res=0;
        for(int b:piles){
            res+=Math.ceil((double)b/n);
        }
        return res;

    }
}