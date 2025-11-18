package MY_DSA.CodeChef;

import java.util.Scanner;

public class CCWordle {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int Test=sc.nextInt();
        for(int i=0;i<Test;i++){
            String S=sc.next();
            String T=sc.next();

            StringBuilder sb=new StringBuilder();

            for(int idx=0;idx<5;idx++){
                if(S.charAt(idx)==T.charAt(idx)){
                    sb.append("G");
                }else{
                    sb.append("B");
                }
            }

            System.out.println(sb.toString());
        }

    }
}
