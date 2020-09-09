package _02_数组问题._3_调整数组顺序使奇数位于偶数前面;

import java.util.Arrays;

public class OddBeforeEven {

    public static int[] oddEvenMove(int[] arr) {
        /*
         * 题目1：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
         * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
         */
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if ((arr[start] & 0x1) != 0) {
                start++;
            }

            if ((arr[end] & 0x1) == 0){
                end--;
            }
            swap(arr, start, end);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }

    public  static int[] oddEvenMoveKeep(int[] arr) {
        /*
        题目2：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
        使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
        并保证奇数和奇数，偶数和偶数之间的相对位置不变。
         */
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 0, 8, 4, 12, 9, 7};
        int[] res = oddEvenMove(arr);
        System.out.println(Arrays.toString(res));
    }
}
