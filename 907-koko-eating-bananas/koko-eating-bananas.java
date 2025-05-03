class Solution {
    public int eattingHours(int[] piles, int speed){
        int res=0;
        for(int b:piles){
            res+=Math.ceil((double)b/speed);
        }
        return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=0;
        int r=0;
        for(int b:piles){
            if(b>r){
                r=b;
            }
        }
        while(l<=r){
            int m=l+(r-l)/2;
            int hour=eattingHours(piles,m);
            if(hour>h){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return r+1;

        
    }
}