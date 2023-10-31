package Singleton;
import Items.ClothingItem;

public class CartItem {
    private ClothingItem item;
    private int quantity;

    public CartItem(ClothingItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public double getItemTotalPrice() {
        return item.getPrice() * quantity;
    }
}
