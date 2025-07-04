class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length<2){
            return arr.length;
        }
        int inc=1, dec=1,max=1;
        for(int i =1; i<arr.length; i++){
            if(arr[i-1]<arr[i]){
                inc=dec+1;
                dec=1;
            }else if(arr[i-1]>arr[i]){
                dec=inc+1;
                inc=1;
            }else{
                dec=1;
                inc=1;
            }
        max=Math.max(max,Math.max(dec,inc));
        }
        return max;
        
    }
}