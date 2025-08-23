package MY_DSA.Leet;

public class Leet134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len=gas.length;
        if(len==1 && gas[0]>=cost[0]) return 0;
        for(int i=0;i<len;i++){
            if(gas[i]>cost[i]){
                int sidx=i;
                int mytank=0;
                int spendcost=0;
                int count=0;
                while(mytank>=spendcost && count!=len){
                    mytank+=gas[sidx]-spendcost;
                    spendcost=cost[sidx];
                    sidx=(sidx+1)%len;
                    count++;
                }
                if(count==len && mytank>=spendcost){
                    return i;
                }
            }
        }
        return -1;
    }
}
