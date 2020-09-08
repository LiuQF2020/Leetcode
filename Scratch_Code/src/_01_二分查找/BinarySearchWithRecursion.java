package _01_二分查找;

public class BinarySearchWithRecursion {

    /**
     * 递归实现
     * @param arr ： 有序数组
     * @param key ：需要查找的数
     * @return ：返回key在数组array中的下标
     */
    public static int binarySearch(int[] arr, int key) {
        if (arr.length < 1) {
            return -1;
        }
        int index = binarySearch(arr, key, 0, arr.length - 1);
        return index;
    }

    public static int binarySearch(int[] arr, int key, int start, int end) {
        int mid = start + (end - start) / 2;

        // 递归终止条件
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearch(arr, key, start, mid - 1);
        } else if (arr[mid] < key) {
            return binarySearch(arr, key, mid + 1, end);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 9};
        System.out.println(binarySearch(arr, 8));
    }
}
