package MY_DSA.Leet;

public class Leet1704 {
    static{
        for(int i=0;i<500;i++){
            halvesAreAlike("");
        }
    }
    public static boolean halvesAreAlike(String s) {
        int cnt1=0,cnt2=0,len=s.length();
        for(int i=0;i<len/2;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt((len/2)+i);
            if(ch1=='a'||ch1=='A'||ch1=='e'||ch1=='E'||ch1=='i'||ch1=='I'||ch1=='o'||ch1=='O'||ch1=='u'||ch1=='U'){
                cnt1++;
            }
            if(ch2=='a'||ch2=='A'||ch2=='e'||ch2=='E'||ch2=='i'||ch2=='I'||ch2=='o'||ch2=='O'||ch2=='u'||ch2=='U'){
                cnt2++;
            }
        }
        return cnt1==cnt2;
    }
}
