package MY_DSA.String;

public class String03 {
    public static void main(String[] args) {
        StringBuilder s =new StringBuilder(""); //same as arralist
        s.append("hello world");
        System.out.println(s);
        for (int i = 0; i < 5; i++) {
            s.append(i);
        }
        System.out.println(s);
        s.setCharAt(3,'a');
        System.out.println(s);
        s.insert(3,"aa");
        System.out.println(s);
        s.delete(5,7);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        String s1="hello";
    }
}
