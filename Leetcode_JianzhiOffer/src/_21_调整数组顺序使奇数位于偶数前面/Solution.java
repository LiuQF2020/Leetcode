package _21_调整数组顺序使奇数位于偶数前面;

/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。


示例：

输入：nums = [1,2,3,4]
输出：[1,3,2,4]
注：[3,1,2,4] 也是正确的答案之一。

提示：

1 <= nums.length <= 50000
1 <= nums[i] <= 10000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


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
