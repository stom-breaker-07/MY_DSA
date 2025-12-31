package MY_DSA.Leet;

import java.util.List;

public class Leet2828 {
    public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size()) return false;
        for(int i=0;i<words.size();i++){
            if(!words.get(i).startsWith(s.charAt(i)+"")){
                return false;
            }
        }
        return true;
    }
}
