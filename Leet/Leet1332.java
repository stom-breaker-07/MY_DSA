package MY_DSA.Leet;

public class Leet1332 {
    static boolean isPalindrom(String s){
        int i=0 ,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int removePalindromeSub(String s) {
        if(isPalindrom(s)){
            return 1;
        }
        return 2;
    }
}
/*Example 1:

Input: s = "ababa"
Output: 1
Explanation: s is already a palindrome, so its entirety can be removed in a single step.
Example 2:

Input: s = "abb"
Output: 2
Explanation: "abb" -> "bb" -> "".
Remove palindromic subsequence "a" then "bb".
*/