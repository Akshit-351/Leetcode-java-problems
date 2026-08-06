class Solution {
    public int maxProfit(int[] prices) {
        int x = prices[0];
        int maxprofit=0;
        int profit=0;
        for(int i=1; i<prices.length;i++){
            if(x>prices[i]){
                x=prices[i];
            }
            else {
                profit=prices[i]-x;
                if(maxprofit<profit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
    }
}