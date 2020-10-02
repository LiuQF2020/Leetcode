package _35_搜索插入位置;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        if (nums[0] > target)  return 0;

        if (nums.length == 1 && nums[0] < target)  return 1;
        int i;
        for(i = 0; i < nums.length; i++) {
            if(nums[i] < target)  ;
            else if(nums[i] > target)  {
                break;
            }
            else return i;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int num = 2;
        int res = searchInsert(arr, num);
        System.out.println(res);
    }
}
