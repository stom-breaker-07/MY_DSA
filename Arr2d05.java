package MY_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2d05 {
    public int[][] Rotate90deg(int[][] arr ,int row ,int col){
        int[][] ans=new int[row][col];
        for(int i=0 ;i<row ;i++){
            for(int j=0;j<col;j++){
                ans[i][j]=arr[(col-1)-j][i];

            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        Arr2D01 a=new Arr2D01();
        Arr2d05 a5 =new Arr2d05();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and column respectivly :");
        int m =sc.nextInt();
        int n=sc.nextInt();
        int[][] array=a.Get2d(m,n);
        a.Print2d(array,m,n);
        System.out.println(Arrays.deepToString(a5.Rotate90deg(array,m,n)));
    }
}
