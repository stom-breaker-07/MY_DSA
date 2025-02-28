package MY_DSA.math;

import java.util.Scanner;

/*Brute force Approach*/
public class GCD {
    static int getGCD(int x,int y){
        int min =Math.min(x,y);
        for(int i=min;i>0;i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Element X And Y :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Gcd is:"+ getGCD(a,b));
    }
}
