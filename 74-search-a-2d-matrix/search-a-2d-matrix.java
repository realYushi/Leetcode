class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS=matrix.length;
        int COLS=matrix[0].length;
        int l=0;
        int r=ROWS-1;
        int row=-1;
        while(l<=r){
            int m= (l+r)/2;
            if(matrix[m][0]<=target&&matrix[m][COLS-1]>=target){
                row=m;
                break;
            }else if(matrix[m][0]>target){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        if(row==-1){
            return false;
        }
        l=0;
        r=COLS-1;
        while(l<=r){
            int m= (l+r)/2;
            if(matrix[row][m]<target){
                l=m+1;
            }else if(matrix[row][m]>target){
                r=m-1;
            }else{
                return true;
            }
        }
        return false;
        
    }
}