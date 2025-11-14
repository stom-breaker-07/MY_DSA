package MY_DSA.CodeChef;

public class CCcheckCoupon {
    public String checkCoupon(int n, int x, int y, int[] prices) {
        int total=0 ,Dtotal=x;
        for(int price : prices){
            total+=price;
            Dtotal+=(price<y)?0:price-y;
        }
        return (total>Dtotal)?"COUPON":"NO COUPON";
    }
}
