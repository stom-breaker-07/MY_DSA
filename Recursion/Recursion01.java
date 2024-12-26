package MY_DSA.Recursion;

import java.util.Scanner;

public class Recursion01 {
    static void printnum(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        printnum(n-1);
        System.out.print(n +" ");
    }

    static int fibbo(int m){
        if(m==0){
            return 0;
        }
        if(m==1){
            return 1;
        }
        return fibbo(m-1)+fibbo(m-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int a=sc.nextInt();
        printnum(a);
    }
}
