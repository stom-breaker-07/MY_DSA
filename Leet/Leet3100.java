package MY_DSA.Leet;

public class Leet3100 {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int Drinked=0,Empty=0;
        while(numBottles>0){
            Drinked+=numBottles;
            Empty+=numBottles;
            numBottles=0;
            if(Empty>=numExchange){
                numBottles++;
            }
            Empty-=numExchange;
            numExchange++;
        }
        return Drinked;
    }
}
