public class ExtraDiscount extends Discount {
    @Override
    public double calculateDiscount(double total){
        if (total > 200_000){
            return 0.07 * total;
        } else if (total > 150_000){
            return 0.05 * total;
        } else if (total > 100_000){
            return 0.03 * total;
        }
        return 0;
    }
}
