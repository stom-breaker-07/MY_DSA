package MY_DSA.Leet;

public class Leet1493 {
    public int longestSubarray(int[] nums) {
        int start=0,end=0;
        int Max=0;
        int zerocount=0;
        for (end = 0; end < nums.length; end++) {
            if (nums[end] == 0) zerocount++;
            while (zerocount > 1) {
                if (nums[start] == 0) zerocount--;
                start++;
            }
            Max = Math.max(Max, end - start);
        }

        return Max;
    }
}
