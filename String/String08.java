package MY_DSA.String;

public class String08 {
    public static void main(String[] args) {
        String needle="bba";
        int value=0;
        for(int i=0;i<needle.length();i++){
            value^=needle.charAt(i);
        }
        System.out.println(value);
    }
}
