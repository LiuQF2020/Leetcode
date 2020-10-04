package _57_和为s的两个数字;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(target - num);
        }

        int[] res = new int[2];
        for (int num : nums) {
            if (set.contains(num)) {
                res[0] = num;
                break;
            }
        }
        res[1] = target - res[0];
        return res;
    }
}
