package Interview_Prep;

public class StockBuyAndSell {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize minimum buying price to a large value
        int maxProfit = 0; // Initialize maximum profit to 0

        for (int price : prices) {
            // Update the minimum buying price if a lower price is found
            minPrice = Math.min(minPrice, price);
            // Update the maximum profit if a better selling opportunity is found
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Maximum profit in prices1: " + maxProfit(prices1));
        System.out.println("Maximum profit in prices2: " + maxProfit(prices2));
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande