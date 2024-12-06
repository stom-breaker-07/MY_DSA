package MY_DSA.math;

//Convesion of decimal to binary

import java.util.Scanner;

public class DecTOBi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Decimal Number :");
        int n= sc.nextInt();
        int num=0;
        int pov=1;

        while(n>0){
            int l= n % 2;
            num+=(l*(pov));
            pov*=10;
            n = n / 2;
        }
        System.out.println("The Binary number is : "+ num);

    }
}
