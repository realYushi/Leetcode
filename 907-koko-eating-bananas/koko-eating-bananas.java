class Solution {
    private int eating(int[] piles, int speed){
        int res=0;
        for(int p:piles){
            res+=Math.ceil((double)p/speed);
        }
        return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int p:piles){
            if(r<p){
                r=p;
            }
        }
        int res=0;
        while(l<=r){
            int m= l+(r-l)/2;
            int time= eating(piles,m);
            if(h<time){
                l=m+1;
            }else {
                res=m;
                r=m-1;
            }
        }
        return res;
    }
}