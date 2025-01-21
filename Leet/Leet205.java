package MY_DSA.Leet;

import java.util.HashMap;

public class Leet205 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> SnT=new HashMap<>();
        HashMap<Character,Character> TnS=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char S=s.charAt(i);
            char T=t.charAt(i);
            if(SnT.containsKey(S)){
                if(SnT.get(S) != T){
                    return false;
                }
            }else{
                SnT.put(S,T);
            }
            if(TnS.containsKey(T)){
                if(TnS.get(T) != S){
                    return false;
                }
            }else{
                TnS.put(T,S);
            }
        }
        return true;
    }
}

/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the
order of characters. No two characters may map to the same character, but a character may map to itself.*/
