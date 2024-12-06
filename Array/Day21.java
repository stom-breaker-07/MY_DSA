package MY_DSA.Array;


public class Day21 {
    static void  DivintoEqual(int [] a){
        for(int k=1;k< a.length-1;k++){
            int pri=0,suff=0;
            int pcount=0,scount=0;
            for(int i=0;i<k;i++){
                pri+=a[i];
                pcount++;
            }
            for(int j=k;j<a.length;j++){
                suff+=a[j];
                scount++;
            }
            if(pri == suff){
                int n=0;
                System.out.println("Array1");
                while(n < pcount ){
                    System.out.print(a[n] +" ");
                    n++;
                }
                System.out.println("");
                System.out.println("Array2");
                int m=0;
                while(m < scount){
                    System.out.print(a[n] + " ");
                    n++;
                    m++;
                }
            }
            else{
                System.out.println("Array cannot be Divided :");
            }

        }

        }

    public static void main(String[] args) {
        int [] arr={1,3,1,1,2};
        DivintoEqual(arr);
    }
}
