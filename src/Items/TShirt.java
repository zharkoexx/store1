package Items;

import Bridge.ClothingColor;

public class TShirt extends ClothingItem {
    public TShirt(String name, double price) {
        super(name, price);
    }
    public TShirt(ClothingColor color) {
        super(color);
    }

    @Override
    public void display() {
        System.out.println("This is a jacket of color " + clothingColor.getColor());
    }


}
