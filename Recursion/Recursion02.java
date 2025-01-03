package MY_DSA.Recursion;

public class Recursion02 {
     static int fact(int n){
        if(n==1) {
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }

    static int sum(int n){
         if(n==0){
             return 0;
         }
         else{
             return n+sum(n-1);
         }
    }

    static int power(int i,int q){//time complexity : 0(q)
         if(q==1){
             return i;
         }
         else{
             return i*power(i,q-1);
         }
    }

    static int powlog(int i,int q){//time complexity : 0(log q)
         if(q==0)return i;
         int smallpow = powlog(i,q/2);
         if(q%2==0){
             return smallpow*smallpow;
         }
         return  i*smallpow*smallpow;
    }

    public static void main(String[] args) {
        System.out.println(fact(3));
        System.out.println(sum(10));
        System.out.println(powlog(2,3));
    }
}
