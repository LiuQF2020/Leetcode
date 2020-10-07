package _63_股票的最大利润;
// https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/solution/mian-shi-ti-63-gu-piao-de-zui-da-li-run-dong-tai-2/
// 看精选题解

public class Solution {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int income = 0;
        for (int price : prices) {
            cost = Math.min(cost, price);
            income = Math.max(income, price - cost);
        }
        return income;
    }
}
