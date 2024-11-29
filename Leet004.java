package MY_DSA;

import java.util.Arrays;

public class Leet004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=0 , i=0 , j=0;
        int len1=nums1.length;
        int len2=nums2.length;
        int len=len1+len2;
        int[] ans=new int[len];
        while(  i<len1 || j<len2){
            if( i<len1){
                ans[k++]=nums1[i];
                i++;
            }
            if( j<len2){
                ans[k++]=nums2[j];
                j++;
            }
        }
        Arrays.sort(ans);

        if(len%2!=0){
            double med=ans[len/2];
            return med;
        }
        else{
            int index=len/2;
            double med=(ans[index-1] + ans[index] )/ 2.0;
            return med;

        }

    }
}

//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.