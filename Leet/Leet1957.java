package MY_DSA.Leet;

public class Leet1957 {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int len=s.length();
        int count=0;
        char prev = s.charAt(0);
        sb.append(prev);
        for(int i=1;i<len;i++){
            if(s.charAt(i)==prev){
                count++;
            }
            else{
                count=0;
                prev=s.charAt(i);
            }
            if(count<2){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
