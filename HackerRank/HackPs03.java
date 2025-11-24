package MY_DSA.HackerRank;

import java.util.List;

public class HackPs03 {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int p=0,n=0,z=0,N=arr.size();
        for(int num : arr){
            if(num>0){
                p++;
            }
            else if(num<0){
                n++;
            }
            else {
                z++;
            }
        }
        System.out.printf("%.6f\n",(double) p/N);
        System.out.printf("%.6f\n",(double) n/N);
        System.out.printf("%.6f\n",(double) z/N);
    }
}
