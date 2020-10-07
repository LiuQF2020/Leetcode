package _58_1_翻转单词顺序;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        char[] chars = s.toCharArray();
        int i = s.length() - 1;
        int j = i;
        while(i >= 0) {
            while (i >= 0 && chars[i] != ' ')  i--;
            sb.append(s, i + 1, j + 1).append(" ");
            while (i >= 0 && chars[i] == ' ')  i--;
            j = i;
        }
        return sb.toString().trim();
    }
}