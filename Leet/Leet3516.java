package MY_DSA.Leet;

public class Leet3516 {
    public int findClosest(int x, int y, int z) {
        int diffx=Math.abs(z-x);
        int diffy=Math.abs(z-y);
        if(diffx<diffy){
            return 1;
        }else if(diffx>diffy){
            return 2;
        }
        return 0;
    }
}
