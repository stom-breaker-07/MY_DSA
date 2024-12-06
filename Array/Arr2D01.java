package MY_DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2D01 {
    public void Print2d(int [][] arr,int row ,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println(" ");
        }
    }

    public int[][] Get2d(int row ,int col){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[row][col];
        System.out.println("enter array Element : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               arr[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }
        return arr ;
    }

    public int[][] print2dPas(int row){
        int[][] ans=new int[row][];
        for(int i=0;i<row ;i++){
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;

            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
            System.out.println("");
        }
        return ans;
    }

    public static void main(String[] args) {
        Arr2D01 a=new Arr2D01();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the rows and column respectivly :");
//        int m =sc.nextInt();
//        int n=sc.nextInt();
//        int[][] array=a.Get2d(m,n);
//        a.Print2d(array,m,n);
        System.out.println(Arrays.deepToString(a.print2dPas(5)));
    }
}
