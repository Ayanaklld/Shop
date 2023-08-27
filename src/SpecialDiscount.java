public class SpecialDiscount extends Discount {

    //6% discount
    @Override
    public double calculateDiscount(double total){
        if (total > 250_000){
            return 0.06 * total;
        }
        return 0;
    }
}
