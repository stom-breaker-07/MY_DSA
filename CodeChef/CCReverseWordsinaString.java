package MY_DSA.CodeChef;

public class CCReverseWordsinaString {
    public static String reverseWords(String s) {
        //write your code here...
        String[] str=s.split(" ");
        String[] rstr=new String[str.length];
        for(int i=str.length-1;i>=0;i--){
            rstr[(str.length-1)-i]=str[i];
        }
        return String.join(" ",rstr);
    }
}
