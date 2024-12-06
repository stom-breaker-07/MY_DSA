package MY_DSA.Array;

import java.util.Arrays;

public class ReverseArray {
    public int[] rev(int[] arr){
        int a=0;
        int b = arr.length-1;

        while(a < b ){
            arr[a] += arr[b];
            arr[b] =arr[a]-arr[b];
            arr[a]=arr[a]-arr[b];

            a++;
            b--;
        }
        return arr ;
    }

    public static void main(String[] args) {
        int[] arr1 ={1,2,4,3,5,6,7};
        ReverseArray r = new ReverseArray();
        System.out.println("number is : ");
        System.out.print( Arrays.toString(r.rev(arr1) ) );
    }
}
