class Solution {
    private int bs1(int[][] matrix, int target){
        int res=0;
        int l=0;
        int r=matrix.length-1;
        int rowLen=matrix[0].length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target<matrix[m][0]){
                r=m-1;
            }else if(target>matrix[m][rowLen]){
                l=m+1;
            }else{
                return m;
            }
        }
        return -1;
    }
    private int bs2(int[] list, int target){
        int res=0;
        int l=0;
        int r=list.length-1;
        while(l<=r){
            int m= l+(r-l)/2;
            if(target<list[m]){
                r=m-1;
            }else if(target>list[m]){
                l=m+1;
            }else{
                return m;
            }
        }
        return  -1;

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row= bs1(matrix,target);
        if(row==-1){
            return false;
        }
        return bs2(matrix[row],target)!=-1;
        
        
    }
}