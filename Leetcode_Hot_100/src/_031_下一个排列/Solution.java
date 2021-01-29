package _031_下一个排列;

import java.util.Arrays;

public class Solution {
    public static void nextPermutation(int[] nums) {
        int[] ans;
        int[] pre_nums = Arrays.copyOf(nums, nums.length);
        int[] pre_nums_revers = new int[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            pre_nums_revers[i] = pre_nums[nums.length - i];
        }

        if (Arrays.equals(nums, pre_nums_revers))  nums = pre_nums_revers;
    }

    public static void main(String[] args) {
    }
}
