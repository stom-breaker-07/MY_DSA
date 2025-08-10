package MY_DSA.Leet;

public class Leet2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        boolean[] a = new boolean[400];
        int count = 0;

        for(int n : nums) {
            a[n] = true;
        }

        for(int n : nums) {
            if(a[n] && a[n+diff] && a[n+diff+diff]) count++;
        }
        return count;
    }
}
