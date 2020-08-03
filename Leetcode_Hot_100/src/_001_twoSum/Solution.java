package _001_twoSum;

import java.util.Arrays;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 示例:
 给定 nums = [2, 7, 11, 15], target = 9;
 因为 nums[0] + nums[1] = 2 + 7 = 9;
 所以返回 [0, 1];
 **/


public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int nums_l = nums.length;
        int[] arr_ans = new int[0];

        for (int i = 0; i < nums_l; i++){
            for (int j = i+1; j< nums_l; j++) {
                int sum = nums[i] + nums[j];

                if(target == sum){
                    arr_ans = new int[]{i, j};
                    return arr_ans;
                }
            }
        }

        return arr_ans;
    }


    public static void main(String[] args) {
        int[]  nums_n = {2, 6, 0, 7};

        int[] arr_num = twoSum(nums_n, 6);
        System.out.println("arr " + Arrays.toString(arr_num));
    }
}
