package _04_findNumberIn2DArray_00;

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
}