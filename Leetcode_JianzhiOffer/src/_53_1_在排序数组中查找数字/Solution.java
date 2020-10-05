package _53_1_在排序数组中查找数字;
// 最好用二分法做，因为是排序数组

public class Solution {
    public static int search(int[] nums, int target) {
        int n = 0;
        for (int num : nums) {
            if (num == target)  n++;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8 ,8 , 10};
        System.out.println(search(arr, 8));
    }
}
