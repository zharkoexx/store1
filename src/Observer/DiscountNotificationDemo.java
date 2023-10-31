package Observer;

public class DiscountNotificationDemo {
    public static void main(String[] args) {
        DiscountSubject discountSubject = new DiscountSubject();

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        customer1.subscribeToDiscounts(discountSubject);
        customer2.subscribeToDiscounts(discountSubject);

        discountSubject.setDiscount("New Year Sale: 20% off on winter clothing!");
        // Оба клиента получат уведомление о скидке.

        customer1.unsubscribeFromDiscounts(discountSubject);

        discountSubject.setDiscount("Summer Clearance: 30% off on swimwear!");
        // Только Bob получит уведомление.

    }
}
