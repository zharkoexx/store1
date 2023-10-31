package Strategy;

public class TenPercentDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double totalPrice) {
        if (totalPrice > 30000) {
            return totalPrice * 0.10; // 10% скидка
        }
        return 0; // Если сумма заказа не соответствует условию скидки
    }
}
