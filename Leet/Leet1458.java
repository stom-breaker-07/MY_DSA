package MY_DSA.Leet;

import java.util.Arrays;

public class Leet1458 {
        int[] nums1,nums2;
        int[][] dpMemo;
        int n,m;
        int Neg=(int) -1e9;

        int dp(int i,int j){
            if(i==n || j==m){
                return Neg;
            }

            if(dpMemo[i][j]!=Integer.MIN_VALUE) return dpMemo[i][j];
            int value=nums1[i]*nums2[j];

            int result=Math.max(
                    Math.max(
                            value + dp(i+1,j+1)
                            ,
                            value
                    )
                    ,
                    Math.max(
                            dp(i+1,j)
                            ,
                            dp(i,j+1)
                    )
            );

            return dpMemo[i][j]=result;
        }

        public int maxDotProduct(int[] a, int[] b) {
            nums1=a;
            nums2=b;
            n=nums1.length;
            m=nums2.length;

            dpMemo = new int[n][m];
            for (int i = 0; i < n; i++){
                Arrays.fill(dpMemo[i], Integer.MIN_VALUE);
            }

            return dp(0,0);
        }
}
