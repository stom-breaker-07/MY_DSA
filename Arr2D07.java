package MY_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arr2D07 {
    public void printSprial(int[][] arr,int r,int c){
        int total=0;
        int Tr=0 ,Rc=c-1 ,Br=r-1,Lc=0;
        while(total < r*c){
            for(int j=Lc ;j<=Rc && total < r*c;j++){
                System.out.println(arr[Tr][j]);
                total++;
            }
            Tr++;
            for(int i=Tr ;i<=Br && total < r*c ; i++){
                System.out.println(arr[i][Rc]);
                total++;
            }
            Rc--;
            for(int j=Rc ;j>=Lc && total < r*c ;j--){
                System.out.println(arr[Br][j]);
                total++;
            }
            Br--;
            for(int i=Br ;i>=Tr && total < r*c ;i--){
                System.out.println(arr[i][Lc]);
                total++;
            }
            Lc++;

        }
    }

    public int [][] SqrInSpiral(int r,int c){
        int total=1 ,sq=0;
        int[][] ans=new int[r][c];
        int Tr=0 ,Rc=c-1 ,Br=r-1,Lc=0;
        while(total <= r*c){
            for(int j=Lc ;j<=Rc && total <= r*c;j++){
                sq=total*total;
                ans[Tr][j]=sq;
                total++;
            }
            Tr++;
            for(int i=Tr ;i<=Br && total <= r*c ; i++){
                sq=total*total;
                ans[i][Rc]=sq;
                total++;
            }
            Rc--;
            for(int j=Rc ;j>=Lc && total <= r*c ;j--){
                sq=total*total;
                ans[Br][j]=sq;
                total++;
            }
            Br--;
            for(int i=Br ;i>=Tr && total <= r*c ;i--){
                sq=total*total;
                ans[i][Lc]=sq;
                total++;
            }
            Lc++;

        }
        return ans;
    }

    public static void main(String[] args) {
        Arr2D01 a1=new Arr2D01();
        Arr2D07 a7=new Arr2D07();
        Scanner sc=new Scanner(System.in);
        int row7 =sc.nextInt();
        int col7 =sc.nextInt();
  //      int[][] arr1=a1.Get2d(row7,col7);
//        a7.printSprial(arr1,row7,col7);
        System.out.println(Arrays.deepToString(a7.SqrInSpiral(row7,col7)));
    }
}
