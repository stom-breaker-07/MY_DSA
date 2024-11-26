package MY_DSA;

import java.util.Arrays;

public class TwoPointer02 {
    static int[] sortArray(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            int j= arr.length-1;
            while( i < j){
                if(arr[i] < arr[j]){
                    j--;
                }else{
                    arr[i] += arr[j];
                    arr[j] =arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a={5,2,4,3,7,6};
        System.out.println(" Answer is :" + Arrays.toString(sortArray(a)));
    }
}
