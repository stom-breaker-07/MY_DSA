package MY_DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2D03 {
    public int[][]  Multiply2D(int [][] arr1 ,int r1 ,int c1,int [][] arr2 ,int r2 ,int c2 ){
        System.out.println("Multiplcation result is :");
        int[][] ans=new int[r1][c2];
        if(c1 != r2){
            System.out.println("can't multiply bcoz of unEven Row and Column :");
            return null ;
        }
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0; j < c2 ;j++){
                for(int k = 0 ; k < c1 ; k++){
                    ans[i][j] += ( arr1[i][k] * arr2[k][j]);
                }
            }
        }

        return ans ;
    }

    public static void main(String[] args) {
        Arr2D01 a=new Arr2D01();
        Arr2D03 a3=new Arr2D03();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and column  respectivly :");
        int m =sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=a.Get2d(m,n);
        int[][] arr2=a.Get2d(n,m);
        a.Print2d(arr ,m , n);
        a.Print2d(arr2 ,n ,m);
        System.out.println(Arrays.deepToString(a3.Multiply2D(arr ,m ,n ,arr2, n , m)));

    }
}
