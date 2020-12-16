package _031_下一个排列;

import java.util.Arrays;

public class Solution {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int temp;
        int[] nums_1 = Arrays.copyOf(nums, n);

        Arrays.sort(nums);

        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums_1[n - 1 - i]) {
                flag++;
            }
        }

        if (flag == n) {
            for (int i = 0; i < n; i++) {
                nums[i] = nums_1[n - 1 - i];
            }

        }

        else {
            for (int i = n - 1; i > 0; i--) {
                if (nums_1[i] <= nums_1[i - 1]) {
                    continue;
                }
                else {
                    temp = nums_1[i];
                    nums_1[i] = nums_1[i - 1];
                    nums_1[i - 1] = temp;
                    break;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 5, 9};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
