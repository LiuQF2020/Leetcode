package _03_数组中找重复的数字;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    public static void main(String[] args) {

        Solution sl = new Solution();

        int[] arr = {2, 1, 0, 0, 6, 6, 9, 8, 4, 4};
        int num_du = sl.findRepeatNumber(arr);
        System.out.println("num_du = " + num_du);
    }

    public int findRe(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))  return num;

            set.add(num);
        }
        return -1;
    }
}
