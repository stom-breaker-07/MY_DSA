package MY_DSA;

import java.util.Scanner;

public class useMethod {
    public int methodadd(int a, int b) {
        System.out.println("Sum is :" + (a+b));
        return a+b ;
    }
    public int methodsub(int a, int b) {
        System.out.println("Diff is :" + (a-b));
        return a-b ;
    }
    public int methodmul(int a, int b) {
        System.out.println("Sum is :" + (a*b));
        return a*b ;
    }
    public int methoddiv(int a, int b) {
        System.out.println("Sum is :" + (a/b));
        return a/b ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        useMethod m = new useMethod();
        System.out.println("Enter the two numbers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        m.methodadd(x,y);
        m.methodsub(x,y);
        m.methodmul(x,y);
        m.methoddiv(x,y);
    }
}

