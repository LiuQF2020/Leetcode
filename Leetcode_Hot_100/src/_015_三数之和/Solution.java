package _015_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if (nums.length < 3)  return null;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            List<Integer> list = new ArrayList<Integer>();

            int l = i + 1;
            int r = nums.length - 1;
            if (nums[i] > 0)  return null;
            while (l < r - 3) {
                if (nums[l] + nums[i] + nums[r] == 0) {
                    list.add(nums[l]);
                    list.add(nums[i]);
                    list.add(nums[r]);
                    ans.add(list);

                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r++;
                    }
                }

                else if (nums[l] + nums[i] + nums[r] == 0)
            }
        }
    }
}
