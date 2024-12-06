package MY_DSA.Array;

import java.util.Arrays;

public class RotationArr {
    static int [] Rotation(int arr[] ,int times){
        int len= arr.length;
        int[] ans =new int[len];
        times = times%len;
        int j=0;

        for(int i= len-times ;i<len ;i++){
            ans[j++]=arr[i];
        }
        for(int i=0 ; i < len-times ;i++){
            ans[j++]=arr[i];
        }
        return ans ;
    }

    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int t=2;
        System.out.println(Arrays.toString(Rotation(a1,t)));
    }
}
