package MY_DSA.String;

public class Strings01 {
    public void PrintSubString (String s){
        int len=s.length();
        for(int i=0;i<len;i++){
            for (int j=i+1;j<=len;j++){
                System.out.print(s.substring(i,j)+ " ");
            }
        }
    }

    public static void main(String[] args) {
        String s="abcd";
        Strings01 s1=new Strings01();
        s1.PrintSubString(s);
    }
}
