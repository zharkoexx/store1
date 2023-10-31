package Observer;

import java.util.ArrayList;
import java.util.List;

public class DiscountSubject {
    private List<DiscountObserver> observers = new ArrayList<>();
    private String discountDescription; // Описание текущей скидки

    public void addObserver(DiscountObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(DiscountObserver observer) {
        observers.remove(observer);
    }

    public void setDiscount(String description) {
        this.discountDescription = description;
        notifyObservers();
    }

    private void notifyObservers() {
        for (DiscountObserver observer : observers) {
            observer.updateDiscount(discountDescription);
        }
    }
}
