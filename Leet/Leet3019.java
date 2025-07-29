package MY_DSA.Leet;

public class Leet3019 {
    public int countKeyChanges(String s) {
        int count=0;
        String lower=s.toLowerCase();
        for(int i=1;i<lower.length();i++){
            char curr=lower.charAt(i);
            char prev=lower.charAt(i-1);
            if(curr!=prev){
                count++;
            }
        }
        return count;
    }
}
