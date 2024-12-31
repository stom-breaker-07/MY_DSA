package MY_DSA.String;

public class String09 {
    public static void main(String[] args) {
        String str="AAssddnnee";
        int val=0;
        for(int i=0;i<str.length();i++){
           val^=str.charAt(i);
        }
        System.out.println((char)val);
    }
}
