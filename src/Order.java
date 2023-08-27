import java.util.List;

public class Order {
    private double totalCost;
    private List<Discount> discounts;

    public Order(double totalCost, List<Discount> discounts) {
        this.totalCost = totalCost;
        this.discounts = discounts;
    }

    public double getTotalCostWithDiscounts(){
        double totalDiscount = 0;
        for (Discount discount:discounts) {
            totalDiscount += discount.calculateDiscount(totalCost);
        }
        return totalCost - totalDiscount;
    }
}
