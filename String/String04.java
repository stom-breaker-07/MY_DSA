package MY_DSA.String;

public class String04 {
    public static void main(String[] args) {
        String s="PHysiCS";
        StringBuilder ans=new StringBuilder("PHysiCS");
        for(int i=0;i<s.length();i++){
            boolean flag=true;
           char cur=s.charAt(i);
           int asci=(int)cur;
           if(asci>=97) flag = false;
           if(flag==true){
               asci+=32;
               char d=(char)asci ;
               ans.setCharAt(i,d);
           }else{
              asci-=32;
              char d=(char)asci;
              ans.setCharAt(i,d);
           }
        }
        System.out.println(ans);
    }
}
