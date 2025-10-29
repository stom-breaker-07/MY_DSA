package MY_DSA.Leet;

import java.util.Arrays;

public class Leet2545 {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> Integer.compare(b[k], a[k]));
        return score;
    }
}
