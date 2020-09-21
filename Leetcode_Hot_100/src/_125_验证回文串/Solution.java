package _125_验证回文串;

// 双指针方法
public class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;

            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        String str = "w .....)))ew`";
        System.out.println(sl.isPalindrome(str));
    }
}
