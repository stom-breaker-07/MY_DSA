package MY_DSA.TwoPointer;

import java.util.Arrays;

public class TwoPointer03 {

    static int[] sortEvenOdd(int[] arr){
        int i=0;
        int j= arr.length-1;
        while(i < j){
            if(arr[i]%2!=0 && arr[j]%2==0){
                arr[i]+=arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++ ;
            }
            if(arr[j]%2!=0){
                j-- ;
            }
        }
        return arr ;
    }


    public static void main(String[] args) {
        int[] a={5,7,5,8,10,6};
        System.out.println(" Answer is :" + Arrays.toString(sortEvenOdd(a)));
    }
}
