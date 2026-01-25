import java.util.*;

public class buysellStocks {

    public static int sellStocks(int prices[]) {
        int n = prices.length;
        int best_buy[] = new int[n];
        best_buy[0] = Integer.MAX_VALUE;
        int max_profit = 0;
        int profit[] = new int[n];

        // For best buy
        for (int i = 1; i < n; i++) {
            best_buy[i] = Math.min(best_buy[i - 1], prices[i - 1]);
        }
        // Profit
        for (int i = 0; i < n; i++) {
            profit[i] = prices[i] - best_buy[i];
            max_profit = Math.max(profit[i], max_profit);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int profit = sellStocks(prices);
        System.out.println("The maximum profit generated is : " + profit);
    }
}
