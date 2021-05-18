package LeetCode;

public class Problem48 {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j <= i; ++j) {
                if(i ==j) {
                    continue;
                }
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0, j = matrix.length -1; i < matrix.length / 2; ++i,--j) {
            for (int k = 0; k < matrix.length; ++k) {
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
            }
        }
    }
}