package Items;

import Bridge.ClothingColor;

public abstract class ClothingItem extends ClothingColor {
    protected ClothingColor clothingColor;
    private String name;
    private double price;

    public ClothingItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public ClothingItem(ClothingColor color) {
        this.clothingColor = color;
    }

    @Override
    public String getColor() {
        return null;
    }

    public abstract void display();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
