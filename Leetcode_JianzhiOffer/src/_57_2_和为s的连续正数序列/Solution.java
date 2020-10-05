package _57_2_和为s的连续正数序列;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        int i = 1;
        int j = 1;
        int sum = 0;

        while (i < target / 2) {
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] arr = new int[j - i];
                for (int k = 0; k < j - i; k++) {
                    arr[k] = k + i;
                }
                list.add(arr);
                sum -= i;
                i++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
