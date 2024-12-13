package MY_DSA.Array;

import java.util.Arrays;

public class GfG01 {
    class Solution {
        public int getSecondLargest(int[] arr) {
            int smax=-1,i=0;
            Arrays.sort(arr);
            while(i<arr.length){
                if(arr[i]<arr[arr.length-1]){
                    smax=arr[i];
                }
                i++;
            }
            return smax ;
        }
    }
}
