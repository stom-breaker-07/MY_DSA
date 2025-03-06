package MY_DSA.Leet;

public class Leet2579 {
    public long coloredCells(int n) {
        return 1+(long)2*n*(n-1);
    }
}

/* thrugh recursion */

/* public long coloredCells(int n) {
      if(n==1){
        return 1;
      }
      return coloredCells(n-1)+((n-1)*4);
}
*/