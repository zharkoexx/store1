package Registration;

import Singleton.ShoppingCart;

public class RegistrationDemo {
    public static void main(String[] args) {
        CustomerRegistry registry = new CustomerRegistry();

        registry.registerCustomer(1, "Alice");
        registry.registerCustomer(2, "Bob");

        Customer customer1 = registry.getCustomer(1);
        Customer customer2 = registry.getCustomer(2);

        System.out.println("Customer 1: " + customer1.getName());
        System.out.println("Customer 2: " + customer2.getName());

        // Доступ к корзине покупателя
        ShoppingCart cart1 = customer1.getShoppingCart();
        ShoppingCart cart2 = customer2.getShoppingCart();
    }
}

