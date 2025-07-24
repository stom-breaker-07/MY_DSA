package MY_DSA.Leet;

public class Leet012 {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();

        int[] numbers={1000,900,500,400,100,90,50,40,10, 9,5,4,1};
        String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0; i<numbers.length && num>0;i++) {
            while(num >= numbers[i]) {
                s.append(symbols[i]);
                num -= numbers[i];
            }
        }
        return s.toString();
    }
}
