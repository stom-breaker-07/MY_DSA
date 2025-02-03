package MY_DSA.Leet;

public class Leet3105 {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1,In=1,De=1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] < nums[i]){
                In++;
                De=1;
            }
            else if(nums[i+1] > nums[i]){
                De++;
                In=1;
            }
            else{
                In=1;
                De=1;
            }
            max=Math.max(max,Math.max(In,De));
        }

        return max;
    }
}

/*You are given an array of integers nums. Return the length of the longest
subarray
 of nums which is either
strictly increasing
 or
strictly decreasing
.



Example 1:

Input: nums = [1,4,3,3,2]

Output: 2

Explanation:

The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].

The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].

Hence, we return 2.*/