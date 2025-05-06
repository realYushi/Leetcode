class Solution {
    public int eating(int[] piles, int speed){
        int res=0;
        for(int b:piles){
            res+=Math.ceil((double)b/speed);
        }
        return res;

        
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int b:piles){
            if(b>r){
                r=b;
            }
        }
        while(l<=r){
            int m=l+(r-l)/2;
            int time=eating(piles,m);
            if(h<time){
                l=m+1;
            }else{
                r=m-1;
            }

        }
            return l;
        
    }
}