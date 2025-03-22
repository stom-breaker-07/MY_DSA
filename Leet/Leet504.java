package MY_DSA.Leet;

public class Leet504 {
    static int base(int num ){
        int flag=0 ,n=0,pov=1;

        if(num < 0){
            num*=-1;
            flag=1;
        }

        while(num > 0){
            int l= num % 7;
            n+=(l*(pov));
            pov*=10;
            num = num / 7;
        }

        return (flag == 1) ? -n : n;
    }
    public String convertToBase7(int num) {
        if(num == 0 ) return "0";
        return String.valueOf(base(num));
    }
}

/*Example 1:

Input: num = 100
Output: "202"
Example 2:

Input: num = -7
Output: "-10"*/