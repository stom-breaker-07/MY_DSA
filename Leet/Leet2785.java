package MY_DSA.Leet;

import java.util.Arrays;

public class Leet2785 {
    public String sortVowels(String s) {
        int idx=0;
        StringBuilder t=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                sb.append(c);
            }
        }
        char[] st=sb.toString().toCharArray();
        Arrays.sort(st);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                t.append(st[idx++]);
            }else{
                t.append(s.charAt(i));
            }
        }
        return t.toString();
    }
}
