package _04_有序二维数组中的搜索;

import java.util.Arrays;

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int n = matrix.length;
        int m = matrix[0].length;
        for (int[] ints : matrix)
            for (int j = m - 1; j >= 0; j--) {
                if (target == ints[j]) {
                    return true;
                }
            }

        return false;
    }

    private static final Solution sl = new Solution();
    public static void main(String[] args) {
//        int[][] matrix_test = {{1, 3, 4, 6}, {2, 1, 8, 7}, {0, 2, 3, 5}, {7, 5, 9, 8}};
        int[][] matrix_test = {{1}};
        boolean num = sl.findNumberIn2DArray(matrix_test, 1);
        System.out.println("args = " + num);
    }


    public boolean find2D(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j <= matrix[0].length - 1) {
            if (matrix[i][j] < target)  j++;
            else if (matrix[i][j] > target)  i--;
            else  return true;
        }
        return false;
    }
}