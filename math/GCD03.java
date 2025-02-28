package MY_DSA.math;

/*Euclid's Method*/

import java.util.Scanner;

public class GCD03 {
    static  int GCD(int x,int y){
        if(y==0){
            return x;
        }
        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Element X And Y (Solving using Recursion):");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Gcd is:"+ GCD(a,b));
    }
}
