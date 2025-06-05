class Solution {

    public int bs1(int[][] matix, int target){
        int l=0;
        int r=matix.length-1;
        int row=matix[0].length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target<matix[m][0]){
                r=m-1;
            }else if(target >matix[m][row]){
                l=m+1;
            }else{
                return m;
            }
        }
        return  -1;
    }
    public boolean bs2(int[][] matrix, int rowNumber, int target){
        if(rowNumber==-1){
            return false;
        }
        int[] row= matrix[rowNumber];
        int l=0;
        int r=matrix[0].length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target<row[m]){
                r=m-1;
            }else if(target>row[m]){
                l=m+1;
            }else{
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowNumber=bs1(matrix,target);
        return bs2(matrix,rowNumber,target);
    }
}