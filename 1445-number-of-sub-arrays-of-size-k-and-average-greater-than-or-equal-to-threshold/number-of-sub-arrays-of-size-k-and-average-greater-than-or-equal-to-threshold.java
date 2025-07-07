class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res=0;
        int l=0;
        int sum=0;
        for(int r=0; r<arr.length; r++){
            if(r-l+1==k){
                sum+=arr[r];
                if(sum/k>=threshold){
                    res++;
                }
                sum-=arr[l];
                l++;
            }else if(r-l+1<k){

            sum+=arr[r];
            }
        }
        return res;
        
    }
}