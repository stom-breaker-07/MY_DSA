package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String lower=paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        int Max=0;
        String result="";
        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<String> arr=new ArrayList<>(Arrays.asList(banned));
        for(String s:lower.split(" ")){
            if(!arr.contains(s) && !s.isEmpty()){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>Max){
                Max=entry.getValue();
                result=entry.getKey();
            }
        }

        return result;
    }
}
