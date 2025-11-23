package MY_DSA.CodeChef;
import java.util.Scanner;
import java.util.Arrays;

public class CCLargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int Max=0;
            Arrays.sort(a);
            int lIdx=a.length-1;
            while(a[lIdx]==a[lIdx-1]){
                lIdx--;
            }
            System.out.println(a[lIdx]+a[lIdx-1]);
        }
    }
}
