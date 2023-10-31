package Singleton;
import Items.Jacket;
import Items.TShirt;
import Singleton.ShoppingCart;

public class OrderService {
    public void placeOrder(ShoppingCart cart) {
        // В этом методе вы можете обработать заказ и взаимодействовать с корзиной
        // Например, вы можете провести транзакцию, отправить уведомление о заказе и т.д.
        // Вызовите метод calculateTotal() для корзины для расчета скидки и итоговой стоимости заказа.
        cart.calculateTotal();

        // Далее выполните дополнительную обработку заказа, включая сохранение информации в базу данных и др.
        // ...
    }

    public static void main(String[] args) {
        // Создайте экземпляр корзины для текущего покупателя
        ShoppingCart cart = ShoppingCart.getInstance();

        // Добавьте товары в корзину
        cart.addItem(new Jacket("Winter Jacket", 100.0), 2);
        cart.addItem(new TShirt("Summer T-Shirt", 20.0), 3);

        // Создайте экземпляр OrderService и разместите заказ
        OrderService orderService = new OrderService();
        orderService.placeOrder(cart);
    }
}
