package Decorator;

import Items.ClothingItem;

public class GiftWrap extends ClothingDecorator{
    public GiftWrap(ClothingItem item) {
        super(item);
    }

    @Override
    public void display() {
        System.out.println("This item is wrapped as a gift.");
        decoratedItem.display(); // Display the core item's details
    }


}
