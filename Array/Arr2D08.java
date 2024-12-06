package MY_DSA.Array;

import java.util.Scanner;

public class Arr2D08 {
    static  int findsum(int[][] arr ,int r1,int c1 ,int r2,int c2){
        int sum=0;
        for(int i=r1 ;i<=r2 ;i++){
            for(int j=c1 ;j<=c2 ;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Arr2D08 a8 =new Arr2D08();
        Arr2D01 a1=new Arr2D01();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thr row and column :");
        int r=sc.nextInt();
        int c= sc.nextInt();
        int[][] ar=a1.Get2d(r,c);
        System.out.println("enter the value of r1 ,c1 and r2 ,c2 respectivly :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();

        int ans=a8.findsum(ar,a,b,d,e);
        System.out.println("the sum is : "+ans);
    }
}
