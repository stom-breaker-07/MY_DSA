package MY_DSA.HackerRank;

public class HackSDE02 {
    public static boolean isAlphabeticPalindrome(String code) {
        String s=code.replaceAll("[^a-zA-Z]","").toLowerCase();
        int l=0,r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
