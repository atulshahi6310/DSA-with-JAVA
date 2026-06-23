class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy_price = Integer.MAX_VALUE;
        int max_profit =0;
        for(int i =0;i<n;i++){
            if(buy_price<prices[i]){
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit,profit);
            }else{
                buy_price = prices[i];
            }
        }
        return max_profit;
        
    }
}