class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix.length ==0) return new int[0][0];
        int r_length = matrix.length;
        int c_length = matrix[0].length;
        int new_r = c_length;
        int new_c = r_length;

        int[][] arr = new int[new_r][new_c];

        for(int i=0;i<r_length;i++){
            for(int j =0;j<c_length;j++){
                arr[j][i] = matrix[i][j]; 
            }
        }
        return arr;
    }
}