package MY_DSA.Leet;

public class Leet038 {
    public String countAndSay(int n) {
        String res="1";
        for(int i=1;i<n;i++){
            StringBuilder newString=new StringBuilder();
            int cnt=1;
            for(int j=1;j<res.length();j++){
                if(res.charAt(j)==res.charAt(j-1)){
                    cnt++;
                }
                else{
                    newString.append(cnt);
                    newString.append(res.charAt(j - 1));
                    cnt=1;
                }
            }
            newString.append(cnt);
            newString.append(res.charAt(res.length() - 1));
            res = newString.toString();
        }
        return res;
    }
}
/*Input: n = 4

Output: "1211"

Explanation:

countAndSay(1) = "1"
countAndSay(2) = RLE of "1" = "11"
countAndSay(3) = RLE of "11" = "21"
countAndSay(4) = RLE of "21" = "1211"*/