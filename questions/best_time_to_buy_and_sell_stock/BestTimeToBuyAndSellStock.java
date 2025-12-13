package best_time_to_buy_and_sell_stock;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = maxProfit(prices);
		System.out.println("Max Profit: " + maxProfit);

	}

	private static int maxProfit(int[] prices) {
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : prices) {
			if (price < buyPrice) {
				buyPrice = price;
			} else if (price - buyPrice > maxProfit) {
				maxProfit = price - buyPrice;
			}
		}
		return maxProfit;
	}

}
