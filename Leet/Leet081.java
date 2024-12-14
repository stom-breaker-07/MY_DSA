package MY_DSA.Leet;

import java.util.Arrays;

public class Leet081 {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int len=nums.length ;
        int i=0, j=len-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]<target){
                i=mid+1;
            }
            if(nums[mid]>target){
                j=mid-1;
            }
        }
        return false;
    }
}
