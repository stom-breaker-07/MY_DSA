package MY_DSA.Leet;

public class Leet1859 {
    public String sortSentence(String s) {
        String[] str =s.split(" ");
        String[] result=new String[str.length];
        for(int i=0;i<str.length;i++){
            int idx= Integer.parseInt(str[i].replaceAll("[^0-9]",""));
            result[idx-1] = str[i].replaceAll("[0-9]","");
        }
        return String.join(" ",result);
    }
}
