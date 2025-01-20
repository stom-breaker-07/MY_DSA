package MY_DSA.Leet;

public class Leet520 {
    public boolean detectCapitalUse(String word) {
        int cnt=0 , Cnt=0;
        for(char c: word.toCharArray()){
            if(cnt<=1 && c >='a' && c<='z' ){
                Cnt++;
            }
            else if(Cnt<1 && c>='A' && c<='Z' ){
                cnt++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

/*We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
*/
