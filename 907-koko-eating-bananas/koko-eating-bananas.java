class Solution {
    private int eating(int[] piles, int amount){
        int res=0;
        for(int p:piles){
            res+=Math.ceil((double)p/amount);
        }
        return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int p: piles){
            if(r<p){
                r=p;
            }
        }
        int min=0;
        while(l<=r){
            int m=l+(r-l)/2;
            int speed= eating(piles,m); 
            if(h<speed){
                l=m+1;
            }else{
                min=m;
                r=m-1;
            }
        }
        return min;
        
        
    }
}