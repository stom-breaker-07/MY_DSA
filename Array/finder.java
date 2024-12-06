package MY_DSA.Array;

public class finder {
    public int finder(int n ,int[] a){
        int count=0;
        for( int i : a){
            if( n == i) {
                count++;
            }else{
                continue ;
            }
        }
        return count ;
    }
}
