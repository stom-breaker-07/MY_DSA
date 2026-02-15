package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet3842 {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<bulbs.size();i++){
            if(!arr.contains(bulbs.get(i))){
                arr.add(bulbs.get(i));
            }else{
                arr.remove(bulbs.get(i));
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
