package MY_DSA.String;

public class String05 {
    static StringBuilder substring(String s) {
        int len = s.length();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < len; i++) {
            StringBuilder cur = new StringBuilder();
            for (int j = i; j < len; j++) {
                cur.append(s.charAt(j));
                ans.append(cur).append(" ");
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String n = "abc";
        StringBuilder a = substring(n);
        System.out.println(a.toString());
    }
}
