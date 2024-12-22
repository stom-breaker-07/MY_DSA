package MY_DSA.String;

public class String06 {
    public static void main(String[] args) {
        String a = "125";
        String b = "456";
        int len=a.length()-1;
        int re=0;
        int carry = 0;

        for (int i = 0; i < a.length(); i++) {
            int res = Integer.parseInt(String.valueOf(a.charAt(i)))
                    + Integer.parseInt(String.valueOf(b.charAt(i)))
                    + carry;
            re += res * (int) Math.pow(10, len - i);
        }
        String str=Integer.toString(re);
        System.out.println(str );
    }
}
