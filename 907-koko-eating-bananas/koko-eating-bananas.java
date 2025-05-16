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
        int min=0;
        for(int n: piles){
            if(r<n){r=n;};
        }
        while(l<=r){
            int m= l+(r-l)/2;
            int time=eating(piles,m);
            if(h<time){
                l=m+1;
            }else{
                r=m-1;
                min=m;
            }
        }
        return  min;
        
    }
}