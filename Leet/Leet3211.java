package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet3211 {
    static void Backtrack(int n,char curr,List<String> ans,StringBuilder sb ){
        if(sb.length()==n){
            ans.add(sb.toString());
            return ;
        }
        Backtrack(n,'1',ans,sb.append('1'));
        sb.deleteCharAt(sb.length()-1);
        if(curr!='0'){
            Backtrack(n,'0',ans,sb.append('0'));
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> validStrings(int n) {
        List<String> result=new ArrayList<>();
        Backtrack(n,'s',result,new StringBuilder());
        return result;
    }
}
