package MY_DSA.CodeChef;

import java.util.Scanner;

public class CCDifficultyRatingOrder {
    static boolean isNonDecreasing(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }

            System.out.println((isNonDecreasing(d))?"Yes":"No");
        }
    }
}
