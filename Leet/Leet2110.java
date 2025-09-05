package MY_DSA.Leet;

public class Leet2110 {
    public long getDescentPeriods(int[] prices) {
        long count=0;
        int i=0;
        while(i<prices.length){
            int j=i+1;
            while(j<prices.length && prices[j-1]-prices[j]==1){
                j++;
            }
            long n=(j-i);
            count+=(n*(n+1))/2;
            i=j;
        }
        return count;
    }
}
