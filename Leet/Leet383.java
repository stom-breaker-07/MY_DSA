package MY_DSA.Leet;

public class Leet383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alpR=new int[26];
        int[] alpM=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            alpR[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            alpM[magazine.charAt(i)-'a']++;
        }

        for(int i=0;i<alpM.length;i++){
            if(alpM[i]<alpR[i]){
                return false;
            }
        }
        return true;
    }
}
/*Given two strings ransomNote and magazine, return true
if ransomNote can be constructed by using the letters from magazine
and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false*/