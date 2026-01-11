package MY_DSA.CodeChef;

import java.util.Scanner;

public class CCAddOne {
    static String AddOne(String s){
        StringBuilder sb=new StringBuilder(s);
        int i=s.length()-1;

        while(i>=0 && s.charAt(i)=='9'){
            sb.setCharAt(i,'0');
            i--;
        }

        if(i<0){
            sb.insert(0,'1');
        }
        else{
            sb.setCharAt(i,(char)(sb.charAt(i)+1));
        }
        return sb.toString();
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while(T-->0){
            String s=sc.next();
            System.out.println(AddOne(s));
        }

    }
}
