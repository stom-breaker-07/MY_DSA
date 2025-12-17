package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet2194 {
    public List<String> cellsInRange(String s) {
        List<String> str=new ArrayList<>();
        int startchar=s.charAt(0) ;
        int endchar=s.charAt(3) ;
        int startInt =s.charAt(1) - '0';
        int endInt  =s.charAt(4) - '0';
        for(int i=startchar ;i<=endchar ; i++){
            for(int j=startInt ;j<=endInt ; j++){
                str.add(""+ (char) i + j);
            }
        }
        return str;
    }
}
