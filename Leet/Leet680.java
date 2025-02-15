package MY_DSA.Leet;

public class Leet680 {
    private boolean isPalindrom(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1,flag=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrom(s,i+1,j) || isPalindrom(s,i,j-1);
            }
            i++;
            j--;
        }
        return true ;
    }
}
/*Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false*/