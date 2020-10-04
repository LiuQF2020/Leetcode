package _56_1_数组中数字出现的次数;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] singleNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int num : nums) {
            if (map.containsKey(num))  map.put(num, 0);
            else map.put(num, 1);
        }

        int i = 0;
        for(Object key: map.keySet()){
            if(map.get(key).equals(1)){
                res[i] = (int) key;
                i++;
            }
        }
        return res;
    }
}
