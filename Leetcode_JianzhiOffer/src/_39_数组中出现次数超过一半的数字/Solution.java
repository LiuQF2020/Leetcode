package _39_数组中出现次数超过一半的数字;

// https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/solution/mian-shi-ti-39-shu-zu-zhong-chu-xian-ci-shu-chao-3/
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static int majorityElement(int[] nums) {
        int target = nums[0];
        int k = 1;
        for (int num : nums) {
            if (num == target)  k++;
            else  k--;
            if (k == 0) {
                target = num;
                k = 1;
            }
        }

        int i = 0;
        for (int num : nums) {
            if (num == target) i++;
        }
        if (i > nums.length / 2)  return target;
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 1, 5, 2, 1, 2};
        System.out.println(majorityElement(arr));
    }
}
