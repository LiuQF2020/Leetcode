package _1_二分查找;

public class BinarySearch {

    /**
     * 非递归实现
     * @param arr ：有序数组
     * @param key ：需要查找的数
     * @return ：返回key在数组arr中的下标
     */
    public static int binarySearch(int[] arr, int key) {
        if (arr.length < 1)     return -1;
        int start = 0, mid, end = arr.length - 1;

        while (start <= end) {
            // 防止int溢出
            mid = start + (end - start) / 2;

            if (arr[mid] > key) {
                end = mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 9};
        System.out.println(binarySearch(arr, 8));
    }
}
