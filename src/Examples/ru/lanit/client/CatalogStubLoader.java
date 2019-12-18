package Examples.ru.lanit.client;

import Examples.ru.lanit.stocklist.FoodItem;
import Examples.ru.lanit.stocklist.GenericItem;
import Examples.ru.lanit.stocklist.ItemCatalog;
import Examples.ru.lanit.stocklist.TechItem;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CatalogStubLoader implements CatalogLoader {


    @Override
    public void load(ItemCatalog catalog) {
        FoodItem item =
                new FoodItem(
                        "Apple",
                        120,
                        new GregorianCalendar(2019, Calendar.DECEMBER, 16),
                        (short) 30
                );
        FoodItem item10 =
                new FoodItem(
                        "Груша",
                        10,
                        item,
                        new GregorianCalendar(2019, Calendar.DECEMBER, 16),
                        (short) 10);
        System.out.println(item10);
        GenericItem item1 =
                new TechItem("TV", 150, (short) 30);
        GenericItem item2 =
                new TechItem("TV", 150, (short) 35);
        GenericItem item3 =
                new TechItem("TV", 150, (short) 35);
        GenericItem item4 =
                new TechItem("TV", 150, (short) 35);
        GenericItem item5 =
                new TechItem("TV", 150, (short) 35);
        GenericItem item6 =
                new TechItem("TV", 150, (short) 35);
        GenericItem item7 =
                new TechItem("TV", 150, (short) 35);
        GenericItem item8 =
                new TechItem("TV", 150, (short) 35);
        GenericItem item9 =
                new TechItem("TV", 150, (short) 35);
        catalog.addItem(item);
        catalog.addItem(item1);
        catalog.addItem(item2);
        catalog.addItem(item3);
        catalog.addItem(item4);
        catalog.addItem(item5);
        catalog.addItem(item6);
        catalog.addItem(item7);
        catalog.addItem(item8);
        catalog.addItem(item9);
        catalog.addItem(item10);
    }
}
