package MY_DSA.Sorting;

import java.util.Arrays;

public class SelectionS {
    public void SelectionS(int[] arr ){
        int len=arr.length;
        for(int i=0;i<len-1;i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                   int temp =arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a={2,3,1,5,2,5,2};
        SelectionS ss=new SelectionS();
        ss.SelectionS(a);
        System.out.println(Arrays.toString(a));
    }
}
