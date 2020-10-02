package _50_第一个只出现一次的字符;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Boolean> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, !map.containsKey(c));
        }

        for (char c : chars) {
            if (map.get(c))  return c;
        }
        return ' ';
    }
}
