class Solution {
    public int bs1(int[][] matrix,int target){
        int l=0;
        int r=matrix.length-1;
        int row=matrix[0].length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target>matrix[m][row]){
                l=m+1;
            }else if(target<matrix[m][0]){
                r=m-1;
            }else{
                return m;
            }
        }
        return -1;
    }
    public int bs2(int[] list,int target){
        int l=0;
        int r=list.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target>list[m]){
                l=m+1;
            }else if(target<list[m]){
                r=m-1;
            }else{
                return m;
            }
        }
        return -1;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=bs1(matrix,target);
        if(row==-1){
            return false;
        }
        int res=bs2(matrix[row],target);

        return !(res==-1);

        
        

        
    }
}