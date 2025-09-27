package MY_DSA.Leet;

public class Leet1816 {
    public String truncateSentence(String s, int k) {
        String[] sa=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(sa[i]);
            if(i!=k-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
