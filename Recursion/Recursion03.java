package MY_DSA.Recursion;

public class Recursion03 {
    static  void  multiplies(int num ,int k){
        if(k==1) {
            System.out.print(num + " ");
            return;
        }
        else {
            multiplies(num,k-1);
            System.out.print(num*k + " ");
        }
    }

    static int AddSub (int n){
        if(n==1 )return 1;
        if(n%2==0) {
            return AddSub(n-1)-n;
        }
        return AddSub(n-1)+n ;
    }

    public static void main(String[] args) {
        System.out.println(AddSub(10));
    }
}

