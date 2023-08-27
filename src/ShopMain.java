import java.util.List;

public class ShopMain {
    public static void main(String[] args) {
        // Необходимо расписать следующие классы:
        // 1) Заказ с общей стоимостью и скидками (при условии, что к одному заказу
        // может быть применено несколько скидок).
        // 2) Реализовать три класса каждый из которых был бы уникальной скидкой.

        // Fixed - фиксированная скидка в 4% от общей стоимости заказа.

        // Special - если общая стоимость заказа превышает 250,000, то скидка
        // должна быть 6%, иначе 0.

        // Extra - если общая стоимость заказа превышает 100,000, то скидка должна
        // быть 3%, если превышает 150,000, то 5%, если превышает 200,000, то 7%.

        // Order o1 = new Order(120_000, [fixed]); // 4%
        // Order o2 = new Order(225_000, [special, extra]); // 7%
        // Order o3 = new Order(276_000, [fixed, special, extra]); // 17%
        // Order o4 = new Order(700_000, [special, extra]); // 13%
        // Order[] orders = new Order[]{o1, o2, o3, o4};
        // for (Order order : orders) {
        //   System.out.println(order.getTotalWithDiscounts());
        // }

         Discount fixed = new FixedDiscount();
         Discount special = new SpecialDiscount();
         Discount extra = new ExtraDiscount();

         Order o1 = new Order(120_000, List.of(fixed)); //4%
         Order o2 = new Order(225_000, List.of(special, extra)); //7%
         Order o3 = new Order(276_000, List.of(fixed, special, extra)); //17%
         Order o4 = new Order(700_000, List.of(special, extra)); //13%

         Order[] orders = new Order[]{o1, o2, o3, o4};
         for (Order order : orders) {
           System.out.println(order.getTotalCostWithDiscounts());
         }
    }
}
