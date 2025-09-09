package MY_DSA.Leet;

public class Leet1221 {
    public int balancedStringSplit(String s) {
        int count=0;
        int current=0;
        for(int i=0;i<s.length();i++){
            if(current==0){
                count++;
            }
            if(s.charAt(i)=='R'){
                current++;
            }else{
                current--;
            }
        }
        return count;
    }
}
