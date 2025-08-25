package MY_DSA.Leet;

import java.util.Arrays;

public class Leet2410 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0;
        while(i<players.length && j<trainers.length){
            if(players[i] <= trainers[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
}
