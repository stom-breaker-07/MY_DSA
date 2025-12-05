package MY_DSA.CodeChef;

public class CCLongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        //write your code here...
        String ans=strs[0];
        int len=ans.length();
        for(String str :strs){
            while(!str.startsWith(ans)){
                ans = ans.substring(0,len--);
            }
        }
        return ans;
    }
}
