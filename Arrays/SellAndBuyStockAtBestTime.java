/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/
public class SellAndBuyStockAtBestTime {
    //  Sell or Buy no. of stock

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit +=(prices[i] - prices[i-1]);
            }
        }
        return profit;
    }

    // Another Method Sell or Buy only 1 stock

    public static int maximumProfit(int[] prices) {
       int maxProfit = 0;
       int minProfit = prices[0];

       for(int i=0;i<prices.length;i++){
           minProfit = Math.min(minProfit,prices[i]);
           int profit = prices[i] - minProfit;
           maxProfit = Math.max(maxProfit,profit);
       }

        return maxProfit;
    }

    public static void main(String args[]){
        int[] prices = {5,2,6,1,4,7,3,6};
        
        System.out.println("Maximum Profit "+maximumProfit(prices));
    }
}