package MY_DSA.Leet;

public class Leet2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;

        int[] less = new int[n];
        int[] high = new int[n];
        int[] ans = new int[n];

        int count = 0;
        int j = 0;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                less[j++] = nums[i];
            } else if (nums[i] == pivot) {
                count++;
            } else {
                high[k++] = nums[i];
            }
        }

        int idx = 0;
        for (int a = 0; a < j; a++) {
            ans[idx++] = less[a];
        }
        for (int a = 0; a < count; a++) {
            ans[idx++] = pivot;
        }
        for (int a = 0; a < k; a++) {
            ans[idx++] = high[a];
        }

        return ans;
    }
}
