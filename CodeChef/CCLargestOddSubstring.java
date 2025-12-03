package MY_DSA.CodeChef;

public class CCLargestOddSubstring {
    public static String findLargestOddSubstring(String num) {
        //write your code here...
        for(int i=num.length()-1;i>=0;i--){
            int cur= num.charAt(i) - '0';
            if(cur%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "-1";
    }
}
