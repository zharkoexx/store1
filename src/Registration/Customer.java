package Registration;

import Singleton.ShoppingCart;

public class Customer {
    private int customerNumber;
    private String name;
    private ShoppingCart shoppingCart; // Связь с корзиной покупателя

    public Customer(int customerNumber, String name) {
        this.customerNumber = customerNumber;
        this.name = name;
        this.shoppingCart = new ShoppingCart();
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}

