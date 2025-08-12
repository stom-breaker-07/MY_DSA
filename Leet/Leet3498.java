package MY_DSA.Leet;

public class Leet3498 {
    public int reverseDegree(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            int curr='z'-s.charAt(i) +1;
            result+=curr*(i+1);
        }
        return result;
    }
}
