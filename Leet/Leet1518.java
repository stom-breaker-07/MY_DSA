package MY_DSA.Leet;

public class Leet1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int Drinked=0,Empty=0;
        while(numBottles>0){
            Drinked+=numBottles;
            Empty+=numBottles;
            numBottles = Empty / numExchange ;
            Empty = Empty % numExchange;
        }
        return Drinked;
    }
}
