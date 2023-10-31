package Strategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double totalPrice) {
        return 0; // Нет скидки
    }
}
