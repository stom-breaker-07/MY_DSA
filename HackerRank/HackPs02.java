package MY_DSA.HackerRank;

import java.util.List;

public class HackPs02 {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int d1=0,d2=0,row=arr.size()-1,column=arr.get(0).size();
        for(int i=0;i<column;i++){
            d1+=arr.get(i).get(i);
            d2+=arr.get(row-i).get(i);
        }
        return Math.abs(d1-d2);
    }
}
