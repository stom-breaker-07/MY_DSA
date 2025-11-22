package MY_DSA.CodeChef;

import java.util.ArrayList;
import java.util.Scanner;

public class CCConvertStringtoTitleCase {
    static boolean isfullupper(String s){
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->=0){
            String s=sc.nextLine();
            String[] arr=s.split(" ");
            ArrayList<String> str=new ArrayList<>();
            for(String each : arr){
                if(isfullupper(each)){
                    str.add(each);
                }
                else{
                    StringBuilder sb=new StringBuilder();
                    sb.append(Character.toUpperCase(each.charAt(0)));
                    for(int i=1;i<each.length();i++){
                        sb.append(Character.toLowerCase(each.charAt(i)));
                    }
                    str.add(sb.toString());
                }

            }
            System.out.println(String.join(" ",str));
        }

    }
}
