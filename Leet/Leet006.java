package MY_DSA.Leet;

import java.util.ArrayList;

public class Leet006 {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows >= s.length()) return s;

        ArrayList<StringBuilder> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(new StringBuilder());
        }

        int CurrentRow=0;
        boolean direction=false;

        for(char c:s.toCharArray()){
            list.get(CurrentRow).append(c);

            if(CurrentRow == 0 || CurrentRow == numRows-1){
                direction=!direction;
            }

            CurrentRow+=direction?1:-1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : list) {
            result.append(row);
        }

        return result.toString();
    }
}
