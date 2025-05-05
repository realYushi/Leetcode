class Solution {
    public int bs1(int[][] matix, int target){
        int l=0;
        int r= matix.length-1;
        int rowLen=matix[0].length-1;
        while(l<=r){
            int m= l+(r-l)/2;
            if(target<matix[m][0]){
                r=m-1;
            }else if(target>matix[m][rowLen]){
                l=m+1;
            }else{
                return m;
            }
        }
        return -1;
    }
    public boolean bs2(int[] list, int target ){
        int l=0;
        int r= list.length-1;
        while(l<=r){
            int m= l+(r-l)/2;
            if(target<list[m]){
                r=m-1;
            }else if(target > list[m]){
                l=m+1;
            }else{
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=bs1(matrix,target);
        if(row==-1){
            return false;
        }
        return bs2(matrix[row],target);
        
    }
}