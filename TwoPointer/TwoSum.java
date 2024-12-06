package MY_DSA.TwoPointer;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {

    static ArrayList<ArrayList<Integer>> TwoSum(int[] a ,int t){

        ArrayList<ArrayList<Integer>> lO = new ArrayList<>();

        for(int i=0 ;i<a.length -1;i++){
            for(int j=i+1;j<a.length ;j++){
                if(a[i]+a[j] == t) {
                    ArrayList<Integer> lI = new ArrayList<>();
                    lI.add(a[i]);
                    lI.add(a[j]);

                    lO.add(lI);
                }
            }
        }
        return lO;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr ={1,2,3,4,5};
        System.out.println("Enter the the target element :");
        int target= sc.nextInt();
        System.out.println( TwoSum(arr ,target));

    }
}
