package _33_搜索旋转排序数组;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)  return mid;

            if(nums[0] <= nums[mid]) {
                if(nums[0] <= target && nums[mid] > target)  right = mid - 1;
                else  left = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[right])   left = mid + 1;
                else  right = mid - 1;
            }
        }
        return -1;
    }
}