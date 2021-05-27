/*
    In daily share trading, a buyer buys shares in the morning and sells them on the same day. 
    If the trader is allowed to make at most 2 transactions in a day, whereas the second transaction 
    can only start after the first one is complete (Sell->buy->sell->buy). Given stock prices 
    throughout the day, find out the maximum profit that a share trader could have made.

*/ 
 // valley-peak approach
public class MaximumProfitByBuyingAndSellingShareAtMostTwice {
    public static void main(String[] args) {
        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
                /*
                           80
                           /
            30            /
           /  \          25
          /    15       /
         /      \      /
        2        10   /
                   \ /
                    8
         */
        int profit = 0;
        
        for(int i=1;i<price.length;i++){
            int sub = price[i] - price[i-1];
            if(sub > 0){
                profit +=sub;
            }
        }
        System.out.println("Maximum Profit "+profit);
    }
}