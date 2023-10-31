package State;

public class InStockState implements ClothingState {
    @Override
    public void displayAvailability() {
        System.out.println("This clothing is in stock and available for purchase.");
    }
}
