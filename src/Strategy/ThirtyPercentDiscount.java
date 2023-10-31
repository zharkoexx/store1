package Strategy;

public class ThirtyPercentDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double totalPrice) {
        if (totalPrice > 50000) {
            return totalPrice * 0.30; // 30% скидка
        }
        return 0; // Если сумма заказа не соответствует условию скидки
    }
}
