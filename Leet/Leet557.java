package MY_DSA.Leet;

public class Leet557 {
    static String MakeReverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public String reverseWords(String s) {
        String[] result=s.split(" ");
        for(int i=0;i<result.length;i++){
            result[i]=MakeReverse(result[i]);
        }
        return String.join(" ",result);
    }
}
