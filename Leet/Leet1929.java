package MY_DSA.Leet;

public class Leet1929 {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);

        return result;
    }
}
