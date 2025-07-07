class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0,sum=0,res=0;
        for(int r=0; r<arr.length; r++){
            if(r-l+1<k){
                sum+=arr[r];
            }else{
                sum+=arr[r];
                if(sum/k>=threshold){
                    res++;
                }
                sum-=arr[l];
                l++;
            }
        }
        return res;
        
    }
}