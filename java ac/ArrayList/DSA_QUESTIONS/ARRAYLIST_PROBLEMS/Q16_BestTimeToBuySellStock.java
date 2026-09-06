import java.util.*;
public class Q16_BestTimeToBuySellStock {
    // Keep minimum price so far and best profit. O(n) time, O(1) space.
    public static int maxProfit(ArrayList<Integer> prices) {
        int min=prices.get(0), profit=0;
        for(int p:prices) { min=Math.min(min,p); profit=Math.max(profit,p-min); }
        return profit;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new ArrayList<>(Arrays.asList(7,1,5,3,6,4))));
    }
}