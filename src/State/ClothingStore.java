package State;

public class ClothingStore {
    public static void main(String[] args) {
        ClothingItem jacket = new ClothingItem("Jacket");
        ClothingItem tshirt = new ClothingItem("T-Shirt");

        jacket.displayAvailability(); // Выводит "This clothing is in stock and available for purchase."
        tshirt.displayAvailability(); // Выводит "This clothing is in stock and available for purchase."

        // Меняем состояние товара
        jacket.setState(new OutOfStockState());
        jacket.displayAvailability(); // Выводит "This clothing is currently out of stock."
    }
}

