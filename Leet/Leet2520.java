package MY_DSA.Leet;

public class Leet2520 {
    public int countDigits(int num) {
        int count=0,ref=num;
        while(ref>0){
            int current=ref%10;
            if(current==0) continue;
            else if(num%current==0){
                count++;
            }
            ref/=10;
        }
        return count;
    }
}

//Given an integer num, return the number of digits in num that divide num.
//
//An integer val divides nums if nums % val == 0.