package MY_DSA.Leet;

public class Leet1539 {
    public int findKthPositive(int[] arr, int k) {
        int l = 0, r = arr.length-1;
        while(l <= r) {
            int mid = (l+r)/2;
            if(arr[mid]-mid-1 < k) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return l+k;
    }
}

/*Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.



Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.*/
