package MY_DSA.math;


public class Pattren2 {
    static void PrintBox(int n){
        for(int i=0;i<n;i++){
            for(int j=0 ;j<n;j++){
                if(i==0 || i==n-1){
                    System.out.print("*"+" ");
                }else{
                    if(j==0 || j==n-1){
                        System.out.print("*" + " ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int num=5;
        PrintBox(num);
    }
}


//output

//* * * * *
//*       *
//*       *
//*       *
//* * * * *
