class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i :piles){
            if(i>max){
                max=i;
            }
        }
        int l=1;
        int r=max;
        int res = max;
        while(l<=r){
            int m=l+(r-l)/2;
            int time=0;
            for(int i:piles){
                time+=Math.ceil((double)i/m);
            }
            if(time>h){
                l=m+1;
            }else{
                res=m;
                r=m-1;
            }
        }
        return res;
        
    }
}