package Singleton;

import Items.ClothingItem;
import Strategy.*;
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private static ShoppingCart instance;
    private List<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addItem(ClothingItem item, int quantity) {
        // Добавьте товар в корзину
        // ...
    }

    public void calculateTotal() {
        // Рассчитайте общую стоимость товаров в корзине
        double totalPrice = calculateTotalPrice();
        // Примените стратегию расчета скидки
        DiscountStrategy discountStrategy = chooseDiscountStrategy(totalPrice);
        double discountedPrice = discountStrategy.calculateDiscount(totalPrice);
        // Выведите итоговую стоимость с учетом скидки
        System.out.println("Total Price: $" + discountedPrice);
    }

    private double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (CartItem item : items) {
            totalPrice += item.getItemTotalPrice();
        }
        return totalPrice;
    }



    private DiscountStrategy chooseDiscountStrategy(double totalPrice) {
        if (totalPrice > 50000) {
            return new ThirtyPercentDiscount();
        } else if (totalPrice > 30000) {
            return new TenPercentDiscount();
        } else if (totalPrice > 10000) {
            return new FivePercentDiscount();
        } else {
            return new NoDiscount();
        }
    }
}
