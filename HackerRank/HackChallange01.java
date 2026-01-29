package MY_DSA.HackerRank;

import java.util.List;

public class HackChallange01 {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum=0,calc=0;
        for(int i=0;i<bill.size();i++){
            if(i!=k){
                sum+=bill.get(i);
            }
        }
        calc=b-(sum/2);
        if(calc!=0){
            System.out.println(calc);
        }else{
            System.out.println("Bon Appetit");
        }
    }

}
