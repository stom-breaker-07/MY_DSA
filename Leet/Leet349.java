package MY_DSA.Leet;

import java.util.ArrayList;

public class Leet349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        int[] num1=new int[1001];
        int[] num2=new int[1001];
        for(int i:nums1){
            num1[i]++;
        }
        for(int i:nums2){
            num2[i]++;
        }

        for(int i=0;i<num1.length;i++){
            if(num1[i]>0 && num2[i]>0){
                a.add(i);
            }
        }

        int[] result = new int[a.size()];
        for (int i=0; i<a.size();i++) {
            result[i] = a.get(i);
        }

        return result;
    }
}

/*Given two integer arrays nums1 and nums2, return an array of their
intersection
. Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]*/