package MY_DSA.Leet;

import java.util.Arrays;

public class Leet2164 {
    public int[] sortEvenOdd(int[] nums) {
        int[] odd=new int[nums.length/2];
        int[] even=new int[(nums.length+1)/2];
        int[] ans=new int[nums.length];

        int e=0,o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even[e++]=nums[i];
            }else{
                odd[o++]=nums[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        for(int i=0;i<odd.length/2;i++){
            int temp=odd[i];
            odd[i]=odd[(odd.length -1)-i];
            odd[(odd.length -1)-i]=temp;
        }

        e=0;o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=even[e++];
            }else{
                ans[i]=odd[o++];
            }
        }
        return ans;
    }
}

/*You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:

Sort the values at odd indices of nums in non-increasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
Sort the values at even indices of nums in non-decreasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.
Return the array formed after rearranging the values of nums.

*/