package MY_DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class getArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of element in the array :");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array element :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Printing the elements :");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println("\n"+"After sorting:");
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
