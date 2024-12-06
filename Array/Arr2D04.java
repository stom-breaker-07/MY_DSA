package MY_DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2D04 {
    public int[][] Transpose(int[][] arr ,int row,int col){
        int[][] ans =new int[row][col];
        for(int i=0 ;i<row;i++){
            for(int j=0;j<col;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    public int[][] TransposeInplace(int[][] arr ,int row,int col){
        for(int i=0 ;i<row;i++){
            for(int j=i;j<col;j++){// j=i bcoz of continous swaping leads to same place  so traversing half tringle Dioganal ..
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Arr2D01 a=new Arr2D01();
        Arr2D04 a4=new Arr2D04();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and column respectivly :");
        int m =sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=a.Get2d(m,n);
        System.out.println(Arrays.deepToString(a4.Transpose(arr,m,n)));
    }
}
