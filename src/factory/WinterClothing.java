package factory;

import java.util.ArrayList;
import java.util.List;

public class WinterClothing extends SeasonalClothing{
    public List<String> getAvailableItems() {
        List<String> winterItems = new ArrayList<>();
        winterItems.add("Куртка");
        winterItems.add("Ботинки");
        winterItems.add("Шарф");
        winterItems.add("Головные уборы");
        return winterItems;
    }
}
