package Items;

import Bridge.ClothingColor;

public class Boots extends ClothingItem {
    public Boots(String name, double price) {
        super(name, price);
    }
    public Boots(ClothingColor color) {
        super(color);
    }

    @Override
    public void display() {
        System.out.println("These are boots of color " + clothingColor.getColor());
    }

}
