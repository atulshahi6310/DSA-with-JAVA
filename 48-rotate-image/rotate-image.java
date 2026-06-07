class Solution {
    public void rotate(int[][] matrix) {
        
        int N = matrix.length;
        // swap the uper traingle with the lower traingle
        for(int i =0;i<N;i++){
            for(int j = i+1;j<N;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // now reverse the row of the metrix ;
        for(int i=0;i<N;i++){
            int start =0;
            int end = N-1;
            while(start <= end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start ++;
                end--;
            }
        }
        // return matrix;
    }
}