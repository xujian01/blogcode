package alg.leetcode;

public class No31 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //先转置矩阵
        for (int i=0;i<n;i++) {
            for (int j=i;j<n;j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        //再反转每一行
        for (int i=0;i<n;i++) {
            for (int j=0;j<n/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}
