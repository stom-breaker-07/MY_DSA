package MY_DSA.Leet;

public class Leet014 {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
}


/*
My Approach  5ms to compile not optimized

 public String longestCommonPrefix(String[] strs) {
        int end=0 , len=strs.length;
        if(len==1) return strs[0];
        String ans="";
        while(end < strs[0].length()){
            String ref=strs[0].substring(0,end+1);
            for(int i=1;i<strs.length && end < strs[i].length() ; i++){
                if(ref.equals(strs[i].substring(0, end + 1))){
                    if(i==len-1){
                        ans=ref;
                    }
                }
                else{
                    return ans;
                }
            }
            end++;
        }
        return ans;
    }
* */