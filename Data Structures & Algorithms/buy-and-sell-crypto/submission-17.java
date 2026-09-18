class Solution {
    public int maxProfit(int[] prices) {
        // if prices[i] > prices[k] return 0 as it is not profitable
        // if prices[i] < prices[k] / return prices[k] - prices[i]
        int max = 0;
        int left = 0;
        int right = 1;
        int profit = 0;

        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
                right++;
            }
            else if (prices[right] >= prices[left]){
                profit = prices[right] - prices[left];
                if(profit > max){
                    max = profit;
                }
                right++;
            }
            
        }
        return max;
    }
}
