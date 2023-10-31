package Decorator;

import Items.ClothingItem;

public class SpecialPackaging extends ClothingDecorator{
    public SpecialPackaging(ClothingItem item) {
        super(item);
    }

    @Override
    public void display() {
        System.out.println("This item is in a special packaging.");
        decoratedItem.display();
    }
}
