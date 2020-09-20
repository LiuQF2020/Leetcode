package _02_数组问题._1_找出数组中出现次数大于数组长度一半的数;

/**
 * 题目：在数组中找到出现次数大于数组长度一半的数。
 * 要求：时间复杂的 O(N)，额外空间复杂度 O(1)。
 */
public class FindMajority {

    public static int findOverHalfNum(int[] arr) {

        int x = 0, votes = 0, count = 0;
        for (int num : arr) {
            if (votes == 0)     x = num;

            votes += num == x ? 1 : -1;
        }
        for (int num : arr) {
            if (num == x)   count++;
        }
        return count > arr.length / 2 ? x : 0;  // 无众数时返回0
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 0, 3, 3, 0, };
        System.out.println(findOverHalfNum(arr));
    }
}
