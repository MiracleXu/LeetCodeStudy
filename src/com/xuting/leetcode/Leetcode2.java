package src.com.xuting.leetcode;

/**
 * @author Miracle Xu
 * @Description: 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 * @create: 2019/3/27 10:19
 * @Copyright: 2019 www.lvmama.com All rights reserved.
 **/

public class Leetcode2 {
    public static int maxProfit(int[] prices) {
        int totalMoney = 0;
        int buyMoney = 0;
        //买入卖出标志位，true仅可买入，false仅可卖出
        boolean buyOrSell = true;
        if (prices.length > 0){
            for (int i = 0 ; i < prices.length ; i++){
                if (buyOrSell && i < prices.length-1){
                    if (prices[i] < prices[i+1]){
                        buyMoney = prices[i];
                        buyOrSell = false;
                        continue;
                    }else if (prices[i] > prices[i+1]){
                        continue;
                    }
                }
                if (!buyOrSell){
                    if (i < prices.length-1){
                        if(prices[i] <= prices[i+1]){
                            continue;
                        }else {
                            totalMoney += prices[i] - buyMoney;
                            buyMoney = 0;
                            buyOrSell = true;
                            continue;
                        }
                    }else {
                        if (prices[i] > buyMoney){
                            totalMoney += prices[i] - buyMoney;
                            buyMoney = 0;
                            buyOrSell = true;
                            continue;
                        }
                    }

                }
            }
        }
        return totalMoney;
    }

    public static void main(String[] args) {
//        int[] nums = {7,1,5,3,6,4};
//        int[] nums = {1,2,3,4,5};
        int[] nums = {2,1,2,0,1};
        System.out.println(maxProfit(nums));
    }
}
