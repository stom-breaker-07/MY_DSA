package MY_DSA;

import java.util.Arrays;

public class TwoPointer1 {
    static int[] sortBIArray(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[i] > arr[j]){
                arr[i] += arr[j];
                arr[j] =arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
        return arr ;
    }


    public static void main(String[] args) {
        int[] a={0,1,0,1,1,0,1,0,1,1,0,1,1,0};
        System.out.println(" Answer is :" + Arrays.toString(sortBIArray(a)));
    }
}
