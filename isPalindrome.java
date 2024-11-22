package MY_DSA;

//here[^a-zA-z0-9] plays mager role in the un selecting the alfanumaric charecters ...

public class isPalindrome {
    public boolean isPalindrome(String s) {
        String r=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len =r.length() - 1 ;
        for(int i=0 ;i<r.length() / 2 ;i++ ){
            char chl = r.charAt(i);
            char chr = r.charAt(len - i);
            if(chl != chr ){
                return false;
            }
        }
        return true ;
    }
}

//
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.