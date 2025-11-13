package MY_DSA.HackerRank;

import java.util.Scanner;

public class HackJava01 {
    static void calculate(int a,int b, int n){
        for(int i=0;i<n;i++){
            int j=0,sum=a;
            while(j<=i){
                sum+= (int)(Math.pow(2,(double)j))* b;
                j++;
            }
            System.out.print(sum + " ");
        }
        System.out.println(" ");
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calculate(a, b, n);
        }
        in.close();
    }
}
