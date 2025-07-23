package MY_DSA.Leet;

public class Leet122 {
    public int maxProfit(int[] prices) {
        int prev=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>prev){
                maxprofit+=prices[i]-prev;
                prev=prices[i];
            }else{
                prev=prices[i];
            }
        }
        return maxprofit;
    }
}
