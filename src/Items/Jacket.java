package Items;

import Bridge.ClothingColor;

public class Jacket extends ClothingItem {
    public Jacket(String name, double price) {
        super(name, price);
    }
    public Jacket(ClothingColor color) {
        super(color);
    }

    @Override
    public void display() {
        System.out.println("This is a jacket of color " + clothingColor.getColor());
    }


}
