package MY_DSA.Leet;

import java.util.Arrays;

public class Leet2140 {
    static long findMax(int[][] arr,int idx,long[] m){
        if(idx >= arr.length){
            return 0;
        }
        if(m[idx]!=-1){
            return m[idx];
        }
        long in=findMax(arr,idx+1,m);
        long ex=arr[idx][0]+findMax(arr,idx+arr[idx][1]+1,m);
        return m[idx]=Math.max(in,ex);
    }

    public long mostPoints(int[][] questions) {
        long[] memo=new long[questions.length];
        Arrays.fill(memo,-1);
        return findMax( questions,0,memo);
    }
}
