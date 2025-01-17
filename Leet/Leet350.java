package MY_DSA.Leet;

import java.util.ArrayList;

public class Leet350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> n=new ArrayList<>();
        int[] num1=new int[1001];
        int[] num2=new int[1001];
        for(int i:nums1){
            num1[i]++;
        }
        for(int j:nums2){
            num2[j]++;
        }

        for(int i=0;i<1001;i++){
            if(num1[i]>0 && num2[i]>0){
                int count=Math.min(num1[i],num2[i]);
                while(count>0){
                    n.add(i);
                    count--;
                }
            }
        }

        int[] res=new int[n.size()];
        for(int i=0;i<res.length;i++){
            res[i]=n.get(i);
        }

        return res;
    }
}

/*Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]*/