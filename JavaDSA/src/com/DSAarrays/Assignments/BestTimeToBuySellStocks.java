package com.DSAarrays.Assignments;

//Description: Best Time to Buy and Sell Stock
//Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuySellStocks
{
    public static void main(String[] args)
    {
        System.out.println("Max Profit :"+maxProfit(new int[]{2,4,1}));
    }
    /*
    * Time Complexity: O(n) since we loop through all the elements from 1st index not 0th index
    * Space Complexity: O(1) no extra space is consumed.*/
    public static int maxProfit(int[] prices)
    {
        int buying = 0;
        int selling = 1;
        int maxProfit = 0;

        while(selling < prices.length)
        {
            if(prices[buying]<prices[selling])
            {
                int profit = prices[selling] - prices[buying];

                //maxProfit = Math.max(profit,maxProfit);
                maxProfit = (profit > maxProfit) ? profit : maxProfit;
            }
            else
            {
                buying = selling;
            }
            selling++;
        }

        return maxProfit;
    }
}
