// class Solution {
//     public int[] rowAndMaximumOnes(int[][] mat) {
//         for (int[] row : mat) {
//             Arrays.sort(row);
//         }   
//         int count =0;
//         int row_max = 0;
//          int n = mat.length;
//         int row =0;
//         int col = mat[0].length -1;
//             int temp_count =0;
//          while(row < n && col >=0){
//             if(mat[row][col] == 1){
//                 temp_count++;
//                 col--;
//             }else{
//                 row++;
//                 col = mat[0].length -1;
//                 temp_count =0;
                
//             }
//             if(temp_count > count){
//                 count = temp_count;
//                 row_max = row;
//             }
//         }
    
//        return new int[] {row_max, count};   

//     }
// }

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0;
        int maxRowIndex = 0;
        
        for (int i = 0; i < mat.length; i++) {
            int currentOnes = 0;
            
            // Count 1s in the current row
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    currentOnes++;
                }
            }
            
            // If we find a row with strictly MORE ones, update our trackers
            if (currentOnes > maxOnes) {
                maxOnes = currentOnes;
                maxRowIndex = i;
            }
        }
        
        return new int[] {maxRowIndex, maxOnes};   
    }
}