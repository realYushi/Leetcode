/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=0;
        int r=n;
        int res=n;
        while(l<=r){
            int m=l+(r-l)/2;
            boolean isBad=isBadVersion(m);
            if(!isBad){
                l=m+1;
            }else{
                res=m;
                r=m-1;
            }
        }
        return res;
        

    }
}