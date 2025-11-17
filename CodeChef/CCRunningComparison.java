package MY_DSA.CodeChef;

import java.util.Scanner;

public class CCRunningComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            // Your code goes here
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                int Alice = a[i];
                int Bob = b[i];
                if ((Alice * 2) >= Bob && (Bob * 2) >= Alice) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
