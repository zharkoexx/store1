package State;

public class OutOfStockState implements ClothingState {
    @Override
    public void displayAvailability() {
        System.out.println("This clothing is currently out of stock.");
    }
}