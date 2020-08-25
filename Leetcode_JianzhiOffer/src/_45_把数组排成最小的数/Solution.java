package _45_把数组排成最小的数;

import java.util.Arrays;

public class Solution {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs,(o1,o2) -> (o1+o2).compareTo(o2+o1));
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 13, 7, 8, 6, 21};
        Solution sl = new Solution();
        String strs = sl.minNumber(arr);

        System.out.println(strs);
    }
}
