package MY_DSA.Leet;

public class Leet031 {
    public void nextPermutation(int[] nums) {
        int n=nums.length ,i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]) j--;

            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    private static void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private static void reverse(int[] nums,int s,int e){
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
}

/*Example 1:
31. Next Permutation

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
*/
