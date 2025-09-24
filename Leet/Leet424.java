package MY_DSA.Leet;

public class Leet424 {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int start = 0, maxCount = 0, maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(end) - 'A']);

            while ((end - start + 1) - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
