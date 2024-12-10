package MY_DSA.math;

public class Pattran1 {
    static void Pattean01(int x){
        int k=1;
        for(int i=1;i<=x;i++){
            for(int j=0;j<i;j++){
                System.out.print(k%2 + " ");
                k++;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int y=6;
        Pattean01(y);
    }
}

//output:
//1
//0 1
//0 1 0
//1 0 1 0
//1 0 1 0 1
//0 1 0 1 0 1
