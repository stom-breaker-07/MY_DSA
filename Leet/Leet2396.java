package MY_DSA.Leet;

public class Leet2396 {
    static boolean isPalindrom(String s,int start,int last){
        while(start<last){
            if(s.charAt(start)!=s.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }

    static String baseCode(int n , int base){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%base);
            n/=base;
        }
        return sb.reverse().toString();
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int base=2;base<=n-2;base++){
            String st=baseCode(n,base);
            if(!isPalindrom(st,0,st.length()-1)){
                return false;
            }
        }
        return true;
    }
}
