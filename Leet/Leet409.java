package MY_DSA.Leet;

public class Leet409 {
    public int longestPalindrome(String s) {
        char[] alp = new char[52];
        for(char C: s.toCharArray()){
            if( C>='A' && C <= 'Z' ){
                alp[C -'A']++;
            }else{
                alp[C - 'a' + 26]++;
            }
        }
        int count = 0;
        boolean hasOdd = false;
        for(int i:alp){
            if(i>0){
                if(i%2==0){
                    count+=i;
                }
                else{
                    count+=i-1;
                    hasOdd=true;
                }
            }
        }
        if(hasOdd){
            count++;
        }
        return count;
    }
}
