package MY_DSA.Leet;

public class Leet1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] sArr=text.split(" ");
        int count=sArr.length;
        char[] check=brokenLetters.toCharArray();
        for(String s:sArr){
            for(char c:check){
                if(s.indexOf(c)!=-1){
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}
