package MY_DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2D02 {
    public int[][] AddArray2D(int[][] arr1,int [][] arr2){
        int[][] res=new int [arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                res[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        return res ;
    }

    public static void main(String[] args) {
        Arr2D01 a=new Arr2D01();
        Arr2D02 a2=new Arr2D02();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and column respectivly :");
        int m =sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=a.Get2d(m,n);
        int[][] arr2=a.Get2d(m,n);
        a.Print2d(arr,m,n);
        a.Print2d(arr,m,n);
        System.out.println(Arrays.deepToString(a2.AddArray2D(arr ,arr2)) );
    }
}
