package Registration;

import java.util.HashMap;
import java.util.Map;

public class CustomerRegistry {
    private Map<Integer, Customer> customers = new HashMap<>();

    public void registerCustomer(int customerNumber, String name) {
        Customer customer = new Customer(customerNumber, name);
        customers.put(customerNumber, customer);
    }

    public Customer getCustomer(int customerNumber) {
        return customers.get(customerNumber);
    }
}

