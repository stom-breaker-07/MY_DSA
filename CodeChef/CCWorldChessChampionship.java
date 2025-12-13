package MY_DSA.CodeChef;

import java.util.Scanner;

public class CCWorldChessChampionship {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while(T-- > 0){
            int p=sc.nextInt();
            String str=sc.next();
            int Ccnt=0,Ncnt=0;
            for( char ch : str.toCharArray()){
                if(ch == 'C'){
                    Ccnt+=2;
                }else if(ch == 'N'){
                    Ncnt+=2;
                }else{
                    Ccnt++;
                    Ncnt++;
                }
            }
            if(Ccnt>Ncnt){
                System.out.println( 60*p);
            }else if(Ccnt == Ncnt){
                System.out.println(55*p);
            }
            else{
                System.out.println(40*p);
            }
        }

    }
}
