package MY_DSA;

import java.util.Scanner;

public class LastOccuer {
    static int finder(int[] a) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value to find th last occurence : ");
        int x=s.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==x) {
                count=i;

        }
        System.out.println("The last occered index is" + count);
        return count;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        copy c=new copy();
        System.out.print("Enter the value of n :");
        int n=s.nextInt();
        int[] arr=new int[n];
        c.getArray(n,arr);
        finder(arr);

    }


}
