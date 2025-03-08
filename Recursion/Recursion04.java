package MY_DSA.Recursion;

/* Recursion in an Array */
public class Recursion04 {
    static void PrintRec(int[] arr,int idx){
        if(arr.length == idx || arr.length == 0){
            return ;
        }
        System.out.print(arr[idx ] + " ");
        PrintRec(arr,idx+1);
    }

    static void getMax(int[] arr,int idx ,int max){
        if(arr.length == idx || arr.length == 0){
            System.out.println( "max :"+ max);
            return ;
        }
        max=Math.max(max,arr[idx]);
        getMax(arr,idx+1,max);
    }

    public static void main(String[] args) {
        int m=0;
        int[] a={2,4,3,5,6,9};
        PrintRec(a,0);
        getMax(a,0,m);
    }
}
