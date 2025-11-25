package MY_DSA.Leet;

public class Leet1475 {
    public int[] finalPrices(int[] prices) {
        int[] ans=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int current=prices[i];
            int idx=i+1;
            while(idx < prices.length && current < prices[idx]){
                idx++;
            }
            ans[i]=(idx<prices.length) ? current-prices[idx] : current;
        }
        return ans;
    }
}
