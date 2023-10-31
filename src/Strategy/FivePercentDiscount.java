package Strategy;

public class FivePercentDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double totalPrice) {
        if (totalPrice > 10000) {
            return totalPrice * 0.05; // 5% скидка
        }
        return 0; // Если сумма заказа не соответствует условию скидки
    }
}
