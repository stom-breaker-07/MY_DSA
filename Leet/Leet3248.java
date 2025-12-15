package MY_DSA.Leet;

import java.util.List;

public class Leet3248 {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0,j=0;
        for(String command : commands){
            if(command.equals("RIGHT")){
                j++;
            }
            else if(command.equals("DOWN")){
                i++;
            }
            else if(command.equals("UP")){
                i--;
            }
            else{
                j--;
            }
        }
        return (i*n)+j;
    }
}
