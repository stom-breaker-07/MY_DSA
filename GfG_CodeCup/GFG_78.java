package MY_DSA.GfG_CodeCup;

import java.util.ArrayList;

public class GFG_78 {
    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // Your code here
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1)<= arr.get(i)){
                res.add(arr.get(i));
            }
            else{
                res.add(arr.get(i-1));
            }
        }
        return res;
    }
}
