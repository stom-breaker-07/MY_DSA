package MY_DSA.math;

/*Long division methode*/

import java.util.Scanner;

public class GCD02 {
    static int LongGCD(int x,int y){
        int min=Math.min(x,y);
        int div=Math.max(x,y);
        while(div%min!=0){
            int temp=div%min;
            div=min;
            min=temp;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Element X And Y :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Gcd is:"+ LongGCD(a,b));
    }
}
