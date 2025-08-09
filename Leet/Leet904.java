package MY_DSA.Leet;

import java.util.HashSet;

public class Leet904 {
    public int totalFruit(int[] fruits) {
        HashSet<Integer> set=new HashSet<>();
        int end=0,start=0,Max=0;
        if(fruits.length==0)return 0;
        while(end<fruits.length){
            if(set.size()<2 && !set.contains(fruits[end])){
                set.add(fruits[end]);
            }
            else if(!set.contains(fruits[end])){
                set.add(fruits[end]);
                int rev=end-1;
                while(fruits[rev]==fruits[end-1]){
                    rev--;
                }
                start=rev+1;
                set.remove(fruits[rev]);
            }
            Max=Math.max(Max,end-start +1 );
            end++;
        }
        return Max;
    }
}
