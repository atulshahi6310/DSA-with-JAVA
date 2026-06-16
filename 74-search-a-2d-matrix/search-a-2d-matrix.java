class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int total_row = matrix.length;
        int total_col = matrix[0].length;
        int total_element = total_row *total_col;

        int s =0;
        int e = total_element -1;

        while(s<=e){
            int mid = s +(e-s)/2;
            int row_idx = mid/total_col;
            int col_idx = mid % total_col;

            if(matrix[row_idx][col_idx] == target){
                return true;
            }else if(matrix[row_idx][col_idx] > target){
                e = mid -1;
            }else if(matrix[row_idx][col_idx] < target){
                s = mid +1;
            }
        }
        return false;
    }
}