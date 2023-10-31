package factory;

import java.util.ArrayList;
import java.util.List;

public class SpringAutumnClothing extends SeasonalClothing{
    public List<String> getAvailableItems() {
        List<String> springAutumnItems = new ArrayList<>();
        springAutumnItems.add("Штаны");
        springAutumnItems.add("Верхняя одежда");
        springAutumnItems.add("Кроссы");
        springAutumnItems.add("Платья");
        return springAutumnItems;
    }
}
