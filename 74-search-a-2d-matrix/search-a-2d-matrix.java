class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int l = 0;
        int r = ROWS - 1;
        int row = -1;
        while (l <= r) {
            
            int mid= (l + r) / 2;
            if (matrix[mid][0] <= target && matrix[mid][COLS - 1] >= target) {
                row = mid;
                break;
            } else if (matrix[mid][0] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (row==-1) {
            return false;
        }
        l=0;
        r=COLS-1;
        while(l<=r){
            int m=(l+r)/2;
            if(matrix[row][m]>target){
                r=m-1;
            }
            else if(matrix[row][m]<target){
                l=m+1;
            }
            else{
                return true;
            }
        }
        return false;

    }
}