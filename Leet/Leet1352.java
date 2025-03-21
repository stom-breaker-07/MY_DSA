package MY_DSA.Leet;

import java.util.ArrayList;

public class Leet1352 {
    ArrayList<Integer> arr=new ArrayList<>();
    int p=1;

    /*public ProductOfNumbers() {

    }*/

    public void add(int num) {
        if(num == 0){
            arr=new ArrayList<>();
            p=1;
            return;
        }
        p=p*num;
        arr.add(p);
    }

    public int getProduct(int k) {
        if(arr.size() < k) return 0;
        int ans=arr.get(arr.size()-1);
        if(arr.size() == k) return ans;
        return ans / arr.get(arr.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
