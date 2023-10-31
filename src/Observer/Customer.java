package Observer;

public class Customer implements DiscountObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void updateDiscount(String discountDescription) {
        System.out.println(name + " received a discount update: " + discountDescription);
    }

    public void subscribeToDiscounts(DiscountSubject discountSubject) {
        discountSubject.addObserver(this);
    }

    public void unsubscribeFromDiscounts(DiscountSubject discountSubject) {
        discountSubject.removeObserver(this);
    }
}

