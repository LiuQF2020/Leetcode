package _58_2_左旋转字符串;

public class Solution {
    public static String reverseLeftWords(String s, int n) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] chars = s.toCharArray();

        for (int i = 0; i < n; i++) {
            sb1 = sb1.append(chars[i]);
        }
        for (int i = n; i <= s.length() - 1; i++) {
            sb2 = sb2.append(chars[i]);
        }
        sb2.append(sb1);
        return sb2.toString();
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(reverseLeftWords(str, 2));
    }
}
