package MY_DSA.Leet;

public class Leet3232 {
    public boolean canAliceWin(int[] nums) {
        int singleDigit = 0, doubleDigit = 0;
        for (int num : nums) {
            if (num < 10)
                singleDigit += num;
            else
                doubleDigit += num;
        }
        return singleDigit != doubleDigit;
    }
}
// nums = [1,2,3,4,10]