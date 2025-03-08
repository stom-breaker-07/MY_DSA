package MY_DSA.Leet;

public class Leet171 {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}
/*A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 */