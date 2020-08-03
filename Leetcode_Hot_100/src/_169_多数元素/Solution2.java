package _169_多数元素;

import java.util.HashMap;
import java.util.Map;

// 哈希表
class Solution2 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // maxNum 表示元素，maxCount 表示元素出现的次数
        int maxNum = 0, maxCount = 0;
        for (int num: nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                maxNum = num;
            }
        }
        return maxNum;
    }
}
