package MY_DSA.CodeChef;

import java.util.Scanner;

public class CCDifferentConsecutiveCharacters {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-- > 0){
            int n=sc.nextInt();
            String s=sc.next();
            int cnt=0;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)==s.charAt(i+1)) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
