package MY_DSA;

import java.util.Scanner ;

public class BiTODec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = s.nextInt();
        int num = 0;
        int l;
        int pov = 1;
        while (n > 0) {
            l = n % 10;
            num += (l * (pov));
            pov *= 2;
            n = n / 10;
        }
        System.out.println(num);
    }
}