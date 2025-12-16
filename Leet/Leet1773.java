package MY_DSA.Leet;

import java.util.List;

public class Leet1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt=0 ,key=0;
        if(ruleKey.charAt(0) != 't'){
            key = (ruleKey.charAt(0)=='c')? 1 : 2;
        }
        for(int i=0; i<items.size() ; i++){
            if(items.get(i).get(key).equals(ruleValue)) cnt++;
        }
        return cnt;
    }
}
