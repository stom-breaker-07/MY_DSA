package MY_DSA.Leet;

public class Leet189 {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k%=len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
    private void reverse(int[] nums,int start,int end){
        while(start < end){
            int temp = nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}
/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
* */