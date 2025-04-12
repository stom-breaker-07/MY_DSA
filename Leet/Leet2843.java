package MY_DSA.Leet;

public class Leet2843 {
    int cnt=0;

    public void checkSymm(int num){
        String s=Integer.toString(num);
        if(s.length()%2!=0) return;

        int l=0,r=0,i=0,j=s.length()-1;

        while(i<j){
            l+= s.charAt(i++) - '0';
            r+= s.charAt(j--) - '0';
        }
        if(l==r) cnt++;
    }

    public int countSymmetricIntegers(int low, int high) {
        for (int i = low; i <= high; i++) {
            checkSymm(i);
        }
        return cnt;
    }
}
