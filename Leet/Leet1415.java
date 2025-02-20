package MY_DSA.Leet;

public class Leet1415 {
    int n2;
    public String getHappyString(int n, int k) {
        n2 = n;
        return dfs(new StringBuilder(), n, k);
    }
    public String dfs(StringBuilder prefix, int n, int k){
        if (n == 0)
            return prefix.toString();
        for (char c = 'a'; c <= 'c'; c++) {
            if (prefix.length() > 0 && c == prefix.charAt(prefix.length() - 1))
                continue;
            int cnt = (int) Math.pow(2, n2 - prefix.length() - 1);
            if (cnt >= k)
                return dfs(prefix.append(c), n - 1, k);
            else
                k -= cnt;
        }
        return "";
    }
}
/*Input: n = 1, k = 3
Output: "c"
Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".
Example 2:

Input: n = 1, k = 4
Output: ""
Explanation: There are only 3 happy strings of length 1.
Example 3:

Input: n = 3, k = 9
Output: "cab"
Explanation: There are 12 different happy string of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab"*/