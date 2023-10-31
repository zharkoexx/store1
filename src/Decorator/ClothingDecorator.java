package Decorator;

import Items.ClothingItem;

public abstract class ClothingDecorator extends ClothingItem {
    protected ClothingItem decoratedItem;

    public ClothingDecorator(ClothingItem item) {
        super(item.getName(), item.getPrice());
        decoratedItem = item;
    }

    @Override
    public abstract void display();
}

