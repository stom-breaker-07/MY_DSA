package MY_DSA.Leet;

public class Leet709 {
    public String toLowerCase(String s) {
        StringBuilder mod=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            int Ascii=(int)curr;
            if( Ascii>=65 && Ascii<=90){
                Ascii+=32;
                char n=(char)Ascii;
                mod.append(n);
            }
            else{
                mod.append(curr);
            }
        }
        return mod.toString();
    }
}
