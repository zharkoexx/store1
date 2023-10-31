package State;

public class ClothingItem {
    private String name;
    private ClothingState state;

    public ClothingItem(String name) {
        this.name = name;
        // По умолчанию устанавливаем состояние "есть в наличии"
        state = new InStockState();
    }

    public void setState(ClothingState newState) {
        state = newState;
    }

    public void displayAvailability() {
        System.out.println("Clothing item: " + name);
        state.displayAvailability();
    }
}

