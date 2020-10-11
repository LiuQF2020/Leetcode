package Test;
public class Solution {

    public int getSqrt(int num) {
        long left = 0;
        long right = num / 2 + 1;
        while (left < right) {
            long mid = (left + right + 1) >>> 1;
            long square = mid * mid;
            if (square > num) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }

}
