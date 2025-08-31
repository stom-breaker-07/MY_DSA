package MY_DSA.Leet;

public class Leet3146 {
    public int findPermutationDifference(String s, String t) {
        int per=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            per+=Math.abs(i-t.indexOf(ch));
        }
        return per;
    }
}
