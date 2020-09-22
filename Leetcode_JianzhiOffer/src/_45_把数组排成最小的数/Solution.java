package _45_把数组排成最小的数;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public String minNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        // 这个结构在哪里还能用的上？
        Arrays.sort(str, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Solution sl = new Solution();

        int[] arr = new int[] {3, 8, 4, 1, 9};
        String[] strs = new String[] {"30","10", "1", "3"};
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));

        System.out.println(Arrays.toString(strs));
    }
}
