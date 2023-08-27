public class FixedDiscount extends Discount {

    // fixed discount 4%

    @Override
    public double calculateDiscount(double total){
        return 0.04 * total;
    }
}
