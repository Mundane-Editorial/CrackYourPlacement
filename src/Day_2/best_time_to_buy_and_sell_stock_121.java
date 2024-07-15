package Day_2;
import java.util.*;
public class best_time_to_buy_and_sell_stock_121 {
    public static void main(String args[]){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    private static int maxProfit(int[] prices) {
//        Stack<Integer> s = new Stack<>();
//        int maxProfit = 0;
//        for(int i = 0; i < prices.length ; i++){
//            while(!s.isEmpty() && s.peek()<=prices[i]){
//                int buy = s.pop();
//                int profit = prices[i] - buy;
//                maxProfit = Math.max(maxProfit, profit);
//            }
//            s.push(prices[i]);
//        }
//        return maxProfit;     is wali approach m maximum cases m glt hi aega answer thats why arrays will be used

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
