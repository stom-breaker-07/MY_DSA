package MY_DSA.String;

public class String10backtrac {
    public void Permutation(String s,String p,int idx){
        if(s.length()==0){
            System.out.println(p);
            return;
        }
        for(int i=0;i<s.length();i++){
            char curC=s.charAt(i);
            String curS=s.substring(0,i)+s.substring(i+1);
            Permutation(curS,p+curC,idx+1);
        }
    }
    public static void main(String[] args) {
        String a="ABC";
        String10backtrac s=new String10backtrac();
        s.Permutation(a,"",0);
    }
}
