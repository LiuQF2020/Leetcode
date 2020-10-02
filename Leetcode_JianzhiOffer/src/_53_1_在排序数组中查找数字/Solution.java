package _53_1_在排序数组中查找数字;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : nums) {
            int flag = map.containsKey(num) ? 1 : 0;
            map.put(num, map.get(num) + flag);
        }

        int res = map.get(target);
        return res;
    }
}
