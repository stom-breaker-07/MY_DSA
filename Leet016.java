package MY_DSA;

import java.util.Arrays;

public class Leet016 {
    public int closest3sum (int[] arr ,int target){
        Arrays.sort(arr);
        int len =arr.length;
        int closest=arr[0]+arr[1]+arr[2];
        for(int i=0;i<len-2;i++){
            int j=i+1 ;
            int k=len-2;
            int curr =arr[i]+arr[j]+arr[k];
            if(Math.abs(curr - target) < Math.abs(closest -target)){
                closest=curr;
            }
            if(curr <  target){
                j++;
            }
            else if(curr > target){
                k--;
            }
            else{
                return curr;
            }
        }
        return closest;
    }
}
