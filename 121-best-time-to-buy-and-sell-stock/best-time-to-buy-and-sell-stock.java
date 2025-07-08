class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int MaxProfit = 0;
        for(int i =0; i< prices.length; i++){
            if( buy_price <prices[i] ){
                int profit = prices[i] - buy_price;
                MaxProfit = Math.max(MaxProfit , profit);
            }
            else{
                buy_price = prices[i];
            }
        }
        return  MaxProfit ;
    }
}