// Say you have an array for with the ith element is the price of a given stock on day i.

// Design an algorithm to find the maximum profit. You may complete as many transactions as you like.

// Input: [7,1,5,3,6,4] Output: 7
// Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1=4. Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

class Solution {
  public int maxProfit(int[] prices) {
    if (prices == null || prices.length == 0) {
      return 0;
    }

    int profit = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i + 1] > prices[i]) {
        profit += prices[i + 1] - prices[i];
      }
    }
    return profit;
  }
}