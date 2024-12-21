package MY_DSA.String;

import java.util.*;
public class String02 {
    public static void main(String[] args) {
       String s1="hello";
       String s2="hello";
       String s3=new String("hello");
        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true
    }
}
