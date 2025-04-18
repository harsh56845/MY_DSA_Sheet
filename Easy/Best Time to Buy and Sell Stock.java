// prob link :- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// TC -> O(N)
class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[prices.length-1],sell=0;
        int buyDay=0,pro=0;
        for(int i=prices.length-2;i>=0;i--){
                pro = Math.max(pro,buy-prices[i]);
            if(buy<prices[i]) buy = prices[i];
            
        }
        // for(int j=buyDay;j<prices.length;j++){
        //     pro = Math.max(pro,prices[j]-buy);
        // }
        return pro;
    }
}
