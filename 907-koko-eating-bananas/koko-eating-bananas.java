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
            int speed=eatting(piles,m);
            if(h<speed){
                l=m+1;
            }else{
                res=m;
                r=m-1;
            }
        }
        return res;
    }
    private int eatting(int[] piles, int h){
        int res=0;
        for(int n:piles){
            res+=Math.ceil((double)n/h);
        }
        return res;
    }
}