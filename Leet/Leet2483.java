package MY_DSA.Leet;

public class Leet2483 {
    public int bestClosingTime(String customers) {
        int idx=0,Ys=0,Ns=0,Min=10000;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                Ys++;
            }
        }
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                Ys--;
            }else{
                Ns++;
            }
            if(Min > Ys+Ns){
                idx=i;
                Min=Ys;
            }
        }
        return (idx>0)?idx+1:idx;
    }
}
