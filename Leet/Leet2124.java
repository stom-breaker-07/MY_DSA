package MY_DSA.Leet;

public class Leet2124 {
    public boolean checkString(String s) {
        if(s.length()==1){
            return true;
        }

        int i=0;
        while( i<s.length() && s.charAt(i)!='b'){
            i++;
        }

        if(i==s.length()) return true;

        for(int j=i;j<s.length();j++){
            if(s.charAt(j)=='a'){
                return false;
            }
        }
        return true;
    }
}

/*Given a string s consisting of only the characters 'a' and 'b',
return true if every 'a' appears before every 'b' in the string.
 Otherwise, return false.


Example 1:

Input: s = "aaabbb"
Output: true
Explanation:
The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
Hence, every 'a' appears before every 'b' and we return true.*/