package MY_DSA.Array;

import java.util.Arrays;

public class Arrays1 {
    public int UniqueElem(int arr[]){
        Arrays.sort(arr);
        for(int i=1;i< arr.length;i++){
            if(arr[i-1]!=arr[i]){
                i++;
            }
            else{
               return arr[i];
            }
        }
      return -1 ;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,4,3,4,5};
        Arrays1 a=new Arrays1();
        System.out.println(a.UniqueElem(arr1) );
    }
}
