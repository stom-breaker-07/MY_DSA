package MY_DSA.Leet;

public class Leet860 {
    public boolean lemonadeChange(int[] bills) {
        int fives=0 , tens=0;
        for(int bill : bills){
            if(bill==5){
                fives+=5;
            }
            else if(bill == 10){
                if(fives==0) return false;
                tens+=10;
                fives-=5;
            }
            else{
                if(tens>=10 && fives>=5) {
                    tens-=10;
                    fives-=5;
                }
                else if(fives>=15){
                    fives-=15;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
