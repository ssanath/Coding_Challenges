class Solution {
    public int maxProfit(int[] prices) {
        int maxPro=0,minPri=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if((prices[i]-minPri)>maxPro)
            {
                maxPro = prices[i]-minPri;
            }
            if(prices[i]<minPri)
            {
                minPri = prices[i];
            }
        }
        return maxPro;
    }
}
