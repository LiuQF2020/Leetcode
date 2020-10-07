package _51_数组中的逆序对;

public class Solution {
    public static int reversePairs(int[] nums) {
        if (nums == null || nums.length < 2)  return 0;
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int mergeSort(int[] nums, int l, int r) {
        if (l == r)  return 0;
        int mid = l + ((r - l) >> 1);
        return mergeSort(nums, l, mid) +
                mergeSort(nums, mid + 1, r) +
                merge(nums, l, mid, r);
    }

    public static int merge(int[] nums, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        int res = 0;
        while (p1 <= mid && p2 <= r) {
            // 不能左神那样写，会错。。。不知道为什么，具体写法见
            // https://blog.csdn.net/juruo_hejiarui/article/details/80246074?utm_medium=distribute.pc_aggpage_search_result.none-task-blog-2~all~first_rank_v2~rank_v25-1-80246074.nonecase&utm_term=%E9%80%86%E5%BA%8F%E5%AF%B9&spm=1000.2123.3001.4430

            // 以下两条语句的判断条件，大小判断相反 ，不知道是不是问题所在。
            // res += arr[p1] > arr[p2] ? (mid - p1 + 1) : 0;  // 这句话很关键，与小和问题有些不同。
            // help[i++] = arr[p1] > arr[p2] ? arr[p1++] : arr[p2++];
            if (nums[p1] <= nums[p2])  help[i++] = nums[p1++];
            else {
                help[i++] = nums[p2++];
                res += mid - p1 + 1;
            }
        }
        while (p1 <= mid) {
            help[i++] = nums[p1++];
        }
        while (p2 <= r) {
            help[i++] = nums[p2++];
        }
        for (i = 0; i < help.length; i++) {
            nums[l + i] = help[i];
        }
        return res;
    }
}