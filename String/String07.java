package MY_DSA.String;

public class String07 {
    public char findTheDifference(String s, String t) {
        int len1=s.length(),len2=t.length();
        int i=0,j=0;
        while(i<len1 || j<len2){
            char bit1 =(i<len1)?s.charAt(i):' ';
            char bit2=(j<len2)?t.charAt(j):' ';
            if( bit1 != bit2){
                return bit2;
            }
            i++;
            j++;
        }
        return ' ' ;
    }
}
