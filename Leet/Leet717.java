package MY_DSA.Leet;

public class Leet717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0,len=bits.length;
        while(i<len-1){
            if(bits[i]==1) i+=2;
            else i++;
        }
        return i==len-1;
    }
}
