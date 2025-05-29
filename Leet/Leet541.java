package MY_DSA.Leet;

public class Leet541 {
    public String reverseStr(String s, int k) {
        if (k < 0)
            return s;

        char[] ch = s.toCharArray();
        for(int i=0; i < ch.length; i = i+2*k){
            int left = i;
            int right = Math.min(i+k-1, ch.length-1);
            swapChar(ch,left,right);

        }
        return new String(ch);
    }

    private void swapChar(char[] ch, int left, int right) {
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            ++left;
            --right;
        }
    }
}
