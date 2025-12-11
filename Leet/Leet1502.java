package MY_DSA.Leet;

import java.util.Arrays;

public class Leet1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            if( arr[i+1]-arr[i]!=diff) return false;
        }
        return true;
    }
}
