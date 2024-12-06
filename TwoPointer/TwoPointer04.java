package MY_DSA.TwoPointer;

import java.util.Arrays;

public class TwoPointer04 {
    static int [] squerArr(int[] arr){
        Arrays.sort(arr);
        int i=0;
        int j= arr.length-1;
        int[] ans =new int[arr.length];
        int k=0;
        while(i<= j){
            if( Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k++]=arr[i]*arr[i];
                i++;
            }else{
                ans[k++]=arr[j]*arr[j];
                j--;
            }
        }
        Arrays.sort(ans);
        return ans ;

    }

    public static void main(String[] args) {
        int[] a={5,-7,5,8,-10,-6};
        System.out.println(" Answer is :" + Arrays.toString(squerArr(a)));
    }
}
