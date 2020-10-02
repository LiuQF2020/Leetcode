package _63_股票的最大利润;
// https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/solution/mian-shi-ti-63-gu-piao-de-zui-da-li-run-dong-tai-2/
// 看精选题解

public class Solution {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            cost = Math.min(cost, price);  // 买价：今日买价，与往日最低价相比的最小值；
            profit = Math.max(profit, price - cost);  // 利润：往日最大利润，与今日出售的利润对比，最大值；
        }
        return profit;
    }
}
