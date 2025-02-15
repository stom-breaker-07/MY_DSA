package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        String next="";
        for(int i=0;i<words.length ;i++){
            char[] tempArr=words[i].toCharArray();
            Arrays.sort(tempArr);
            String temp=new String(tempArr);
            if(!temp.equals(next)){
                ans.add(words[i]);
            }
            next=temp;
        }
        return ans;
    }
}
