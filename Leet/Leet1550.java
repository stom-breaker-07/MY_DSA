package MY_DSA.Leet;

public class Leet1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            int j=i;
            while(j<i+3){
                if(arr[j]%2==0) break;
                j++;
            }
            if(j==i+3){
                return true;
            }
            else{
                i=j;
            }
        }
        return false;
    }
}

//Easy Problem