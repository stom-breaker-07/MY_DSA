package MY_DSA.HackerRank;

public class HackPs04 {
    public static void staircase(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            int space=n-i,ash=i;
            while(space>1){
                System.out.print(" ");
                space--;
            }
            while(ash>=0){
                System.out.print("#");
                ash--;
            }
            System.out.println("");
        }
    }
}
