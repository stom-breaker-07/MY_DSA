package MY_DSA.Leet;

public class Leet3813 {
    public int vowelConsonantScore(String s) {
        int v = 0, c = 0;


        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr == 'a' || curr == 'e' || curr == 'i' ||
                    curr == 'o' || curr == 'u') {
                v++;
            } else {
                c++;
            }
        }

        return c == 0 ? 0 : v / c;
    }

}
