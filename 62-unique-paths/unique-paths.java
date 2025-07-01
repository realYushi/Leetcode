class Solution {
    public int uniquePaths(int m, int n) {
        int [][]pd=new int[m][n];
        for(int i=0; i<m;i++){
            pd[i][0]=1;
        }
        for(int i=0; i<n;i++){
            pd[0][i]=1;
        }
        for( int j=1;j<m;j++){
            for(int k=1; k<n;k++){
                pd[j][k]=pd[j-1][k]+pd[j][k-1];
            }
        }
        return pd[m-1][n-1];
        

        
    }
}