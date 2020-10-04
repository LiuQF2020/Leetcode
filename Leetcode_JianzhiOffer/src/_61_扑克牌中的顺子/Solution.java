package _61_扑克牌中的顺子;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int joker = 0;
        for (int i = 0; i < 5; i++) {
            if (nums[i] == 0)  joker++;
            else if (nums[i] == nums[i + 1])  return false;
        }

        return nums[4] - nums[joker] < 5;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(isStraight(arr));
    }
}
