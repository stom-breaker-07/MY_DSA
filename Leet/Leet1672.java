package MY_DSA.Leet;

public class Leet1672 {
    public int maximumWealth(int[][] accounts) {
        int Max=0;
        for(int i=0;i<accounts.length;i++){
            int currentWealth=0;
            for(int j=0;j<accounts[i].length;j++){
                currentWealth+=accounts[i][j];
            }
            if(currentWealth>Max) Max=currentWealth;
        }
        return Max;
    }
}
