package MY_DSA.Array;

import java.util.Scanner;

public class LastOccuer {
    static int finder(int[] a,int x) {
        int count = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                count = i;
            }
        }
        return count ;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,1,3,5,2,1};
        Scanner sc=new Scanner(System.in);
        int last =sc.nextInt();
        System.out.println(finder(arr,last)+" "+"index of array");
    }
}