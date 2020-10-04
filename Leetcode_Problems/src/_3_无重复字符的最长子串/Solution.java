package _3_无重复字符的最长子串;

import java.util.*;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)  return 0;

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int max = 1;
        int left = 0;
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i]))  {
                left = Math.max(left, map.get(chars[i]) + 1);
            }
            map.put(chars[i], i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
