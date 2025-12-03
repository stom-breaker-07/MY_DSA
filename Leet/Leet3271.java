package MY_DSA.Leet;

public class Leet3271 {
    public String stringHash(String s, int k) {
        int len=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i+=k){
            int cursum=0;
            for(char ch: s.substring(i,i+k).toCharArray()){
                cursum+= (ch - 'a');
            }
            int value= cursum%26 ;
            sb.append((char)('a'+value));
        }
        return sb.toString();
    }
}
