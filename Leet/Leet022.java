package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet022 {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        BackTrack(list,new StringBuilder(),0,0,n);
        return list;
    }

    static void BackTrack(List<String> l,StringBuilder sb,int open ,int close,int n){
        if(sb.length() == n*2){
            if(isValid(sb)){
                l.add(sb.toString());
            }
            return;
        }
        if(open<n){
            sb.append('(');
            BackTrack(l,sb,open++,close,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            BackTrack(l,sb,open,close++,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    static boolean isValid(StringBuilder sb){
        int ocnt=0,ccnt=0;
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch == '('){
                ocnt++;
            }
            else if(ch == ')'){
                ccnt++;
            }
            if(ccnt>ocnt){
                return false;
            }
        }
        if(ccnt!=ocnt) return false;

        return true;
    }
}
