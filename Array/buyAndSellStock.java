package Array;

// LeetCode Problem: 121
// Problem: Best Time to Buy and Sell Stock

public class buyAndSellStock {
    public static int maxProfit(int[] prices){
        int maxProfit = 0, bestBuy = prices[0];

        for(int i=1; i<prices.length; i++){
            if(bestBuy < prices[i]){
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }

            if(bestBuy > prices[i]){
                bestBuy = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
