class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        int s_r = 0, e_r = N - 1;
        int s_c = 0, e_c = M - 1;

        while (s_r <= e_r && s_c <= e_c) {

            // Top row
            for (int col = s_c; col <= e_c; col++) {
                ans.add(matrix[s_r][col]);
            }
            s_r++;

            // Right column
            for (int row = s_r; row <= e_r; row++) {
                ans.add(matrix[row][e_c]);
            }
            e_c--;

            // Bottom row
            if (s_r <= e_r) {
                for (int col = e_c; col >= s_c; col--) {
                    ans.add(matrix[e_r][col]);
                }
                e_r--;
            }

            // Left column
            if (s_c <= e_c) {
                for (int row = e_r; row >= s_r; row--) {
                    ans.add(matrix[row][s_c]);
                }
                s_c++;
            }
        }

        return ans;
    }
}