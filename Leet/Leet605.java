package MY_DSA.Leet;

public class Leet605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length , i=0;
        if(len==1){
            if(flowerbed[0]==0 && n<=1){
                return true;
            }else if(flowerbed[0]==1 && n==0){
                return true;
            }
            else{
                return false;
            }
        }
        while(i<len && n>0){
            if(i==0 && flowerbed[i]==0 && flowerbed[i+1]!=1){
                flowerbed[i]=1;
                n--;
            }
            else if(i==len-1 && flowerbed[i]==0 && flowerbed[i-1]!=1){
                flowerbed[i]=1;
                n--;
            }
            else if(i!=len-1 && i!=0 && flowerbed[i]==0 && flowerbed[i+1]!=1 && flowerbed[i-1]!=1){
                flowerbed[i]=1;
                n--;
            }
            i++;
        }
        return n==0;
    }
}
