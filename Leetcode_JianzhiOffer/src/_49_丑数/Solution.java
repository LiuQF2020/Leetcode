package _49_丑数;

class Solution {
    public static int nthUglyNumber(int index) {
        // if (index < 7)    //1-6都为丑数
           // return index;

        int[] nums = new int[index];
        nums[0] = 1;
        int t2 = 0, t3 = 0, t5 = 0;

        for (int i = 1; i < index; i++) {
            //每个丑数都分别乘以2、3、5以得出新的丑数,这样质因子就只有2、3、5
            nums[i] = Math.min(nums[t2] * 2, Math.min(nums[t3] * 3, nums[t5] * 5));
            if (nums[i] == nums[t2] * 2) t2++;

            //不用else if的原因是，如果可能生成重复的丑数，则所有相关t都加1，这样就只生成唯一不重复的丑数
            if (nums[i] == nums[t3] * 3) t3++;
            if (nums[i] == nums[t5] * 5) t5++;
        }
        return nums[index - 1];
    }

    public static void main(String[] args) {
        nthUglyNumber(13);
    }
}
