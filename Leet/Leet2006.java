package MY_DSA.Leet;

public class Leet2006 {
    public int countKDifference(int[] nums, int k) {
        int[] arr = new int[101];
        for (int a : nums) {
            arr[a]++;
        }
        int c = 0;
        for (int i = 1; i + k <= 100; i++) {
            c += arr[i] * arr[i + k];
        }

        return c;
}
