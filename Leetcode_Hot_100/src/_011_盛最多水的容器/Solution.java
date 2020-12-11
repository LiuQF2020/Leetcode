package _011_盛最多水的容器;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxArea(int[] height) {
        int MAX = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int MIN = (j - i) * (Math.min(height[i], height[j]));
                if (MIN >= MAX)  MAX = MIN;
            }
        }
        return MAX;
    }
    public int maxArea1(int[] height) {
        int l = 0, r = height.length - 1;
        int MAX = 0;
        while (l < r) {
            int MIN = Math.min(height[l], height[r]) * (r - l);
            MAX = Math.max(MIN, MAX);
            if (height[l] <= height[r])  l++;
            else r--;
        }

        return MAX;
    }
}
