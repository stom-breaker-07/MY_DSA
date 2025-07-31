package MY_DSA.Leet;

public class Leet2044 {
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for(int num: nums) max |= num;
        return findCounts(nums, 0, max, 0);
    }
    public int findCounts(int[] arr, int idx, int max, int CurrentOr) {
        if(idx >= arr.length) return (CurrentOr == max) ? 1 : 0;
        return findCounts(arr, idx+1, max, CurrentOr) + findCounts(arr, idx+1, max, CurrentOr | arr[idx]);
    }
}
