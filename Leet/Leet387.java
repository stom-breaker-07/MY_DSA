package MY_DSA.Leet;

public class Leet387 {
    public int firstUniqChar(String s) {
        int[] alp=new int[26];
        for(char c:s.toCharArray()){
            alp[c - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if(alp[cur -'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}

/*Given a string s, find the first non-repeating character in it and return its index.
If it does not exist, return -1.



Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character
 that does not occur at any other index.
 */