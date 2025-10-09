package MY_DSA.Leet;

import java.util.HashMap;

public class Leet2325 {
    public String decodeMessage(String key, String message) {
        String Cleankey=key.replaceAll("\\s+","");
        HashMap<Character,Character> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();

        int alphacount=0;
        for(char c: Cleankey.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,(char)('a'+ alphacount++));
            }
            else if(alphacount==26){
                break;
            }
        }

        for(char c :message.toCharArray()){
            if(c == ' '){
                sb.append(c);
            }
            else{
                sb.append(map.get(c));
            }
        }

        return sb.toString();

    }
}
