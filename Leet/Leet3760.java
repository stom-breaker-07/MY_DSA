package MY_DSA.Leet;

import java.util.HashSet;

public class Leet3760 {
    public int maxDistinct(String s) {
        HashSet<Character> diff=new HashSet<>();
        for( char ch : s.toCharArray()){
            diff.add(ch);
        }
        return diff.size();
    }
}
