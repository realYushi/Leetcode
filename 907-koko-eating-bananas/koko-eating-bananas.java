class Solution {
    public int finishEatHours(int[] piles, int speed){
        int hours=0;
        for(int b:piles){
            hours+=Math.ceil((double)b/((double)speed));
        }
        return hours;

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
            int hours=finishEatHours(piles,m);
            if(h<hours){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return r+1;

        
    }
}