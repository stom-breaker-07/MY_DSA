package MY_DSA.HackerRank;

import java.util.List;

public class Hackps05 {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long Max=0,Min=Integer.MAX_VALUE,sum=0;
        for(int e:arr){
            sum+=e;
            Max=Math.max(e,Max);
            Min=Math.min(e,Min);
        }
        System.out.println((sum-Max) + " " + (sum-Min));
    }

}
