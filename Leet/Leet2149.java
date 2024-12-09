package MY_DSA.Leet;

import java.util.Arrays;

public class Leet2149 {
    static int[] ArrangConcegitvePnN(int [] arr){
        int len=arr.length;
        int[] a=new int[len];
        int pi=0,ni=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
                while(arr[pi]<0){
                    pi++;
                }
                a[i]=arr[pi];
            }
            else{
                while(arr[ni]>0){
                    ni++;
                }
                a[i]=arr[ni++];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] b={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(ArrangConcegitvePnN(b)));
    }
}
