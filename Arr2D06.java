package MY_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2D06 {
    //Printing pascal tree
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
        Scanner sc=new Scanner(System.in);
        Arr2D06 a6=new Arr2D06();
        System.out.println("Enter the number of Row :");
        int r=sc.nextInt();
        System.out.println( Arrays.deepToString(a6.print2dPas(r)));
    }
}
