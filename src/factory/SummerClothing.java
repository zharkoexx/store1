package factory;

import java.util.ArrayList;
import java.util.List;

public class SummerClothing {
    public List<String> getAvailableItems() {
        List<String> summerItems = new ArrayList<>();
        summerItems.add("Футболка");
        summerItems.add("Шорты");
        summerItems.add("Тапочки");
        summerItems.add("Купальник");
        return summerItems;
    }
}
