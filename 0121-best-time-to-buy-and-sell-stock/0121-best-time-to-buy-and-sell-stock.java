class Solution {
    public int maxProfit(int[] prices) {
       int minprices = prices[0];
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprices) {
                minprices = prices[i];
            } else {
                int profit = prices[i] - minprices;
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }return maxprofit;
            }
        }
    