package MY_DSA.Leet;

public class Leet2063 {
    public long countVowels(String word) {
        int len=word.length();
        long cnt=0;
        for(int i=len-1;i>=0;i--){
            if(checkvowel(word.charAt(i))){
                cnt+=(long)(i+1)*(len-i);
            }
        }
        return cnt;
    }

    static boolean checkvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}
/*Example 1:

Input: word = "aba"
Output: 6
Explanation:
All possible substrings are: "a", "ab", "aba", "b", "ba", and "a".
- "b" has 0 vowels in it
- "a", "ab", "ba", and "a" have 1 vowel each
- "aba" has 2 vowels in it
Hence, the total sum of vowels = 0 + 1 + 1 + 1 + 1 + 2 = 6. */