package MY_DSA.CodeChef;

import java.util.Scanner;

public class CCChefandHappyString {
    static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    static boolean isHappy(String s){
        for(int i=0;i<s.length();i++){
            if(i<s.length()-2 && isVowel(s.charAt(i))){
                if(isVowel(s.charAt(i+1)) && isVowel(s.charAt(i+2))){ return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            System.out.println((isHappy(s))?"Happy":"Sad");
        }
    }
}
