package Easy;

public class LE017_121KadaneAlgorithm {
    public static void main(String[] args) {
        int [] prices = {7,2,9,1,7};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;
        int currentProfit ;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < buyingPrice){
                buyingPrice = prices[i];
            }
//            Profit if we sell it today itself
            currentProfit = prices[i] - buyingPrice;
            if(maxProfit < currentProfit){
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }
}
