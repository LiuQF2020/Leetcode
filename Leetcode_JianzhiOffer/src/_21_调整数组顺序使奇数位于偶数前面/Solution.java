package _21_调整数组顺序使奇数位于偶数前面;

import java.util.Arrays;

class Solution {
    public int[] exchange(int[] nums) {
        int nums_l = nums.length;
        int ou_l = 0, ji_l = 0;
        for (int i = 0, j = 0; i < nums_l; i++) {
            // 偶数
            if (nums[i] % 2 == 1) {
                j++;
            }
            ou_l = j;
            ji_l = nums_l - ou_l;
        }

        int[] arr_ou = new int[ou_l];
        int[] arr_ji = new int[ji_l];
        for (int i = 0, j = -1, o = -1; i < nums_l; i++) {

            if (nums[i] % 2 == 0) {  // 偶数
                o++;
                arr_ou[o] = nums[i];
            } else { // 奇数
                j++;
                arr_ji[j] = nums[i];
            }
        }

        for (int i = 0; i < ou_l; i++) {
            nums[i] = arr_ou[i];
        }

        for (int i = ou_l, k = 0; i < nums_l; i++, k++) {
            nums[i] = arr_ji[k];
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution sl = new Solution();

        int[] arr = {1, 8, 2, 3, 7, 5, 9, 6};
        int[] nums = sl.exchange(arr);
        System.out.println(Arrays.toString(nums));
    }
}
