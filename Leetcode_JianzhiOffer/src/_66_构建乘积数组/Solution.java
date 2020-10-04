package _66_构建乘积数组;

import java.util.Arrays;

public class Solution {
    public static int[] constructArr(int[] a) {
        int[] res = new int[a.length];
        int[] left = new int[a.length];
        left[0] = 1;
        for (int i = 1; i < a.length; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }

        res[a.length - 1] = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            res[i] = res[i + 1] * a[i + 1];
        }

        for (int i = 0; i < a.length; i++) {
            res[i] *= left[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(constructArr(arr)));
    }
}
