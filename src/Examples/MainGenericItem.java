package Examples;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainGenericItem {

    public static void main(String[] args) {
        GenericItem item =
                new FoodItem(
                        "Apple",
                        120,
                        new GregorianCalendar(2019, Calendar.DECEMBER, 16),
                        (short)30
                );
        GenericItem item10 =
                new GenericItem(
                        "Груша",
                        10,
                        item);
        System.out.println(item10);
        GenericItem item1 =
                new TechItem("TV", 150, (short) 30);
        GenericItem item2 =
                new TechItem("TV", 150, (short) 35);
        System.out.println(item1.equals(item2));

        GenericItem[] items = new GenericItem[2];
        items[0] = item;
        items[1] = item1;
        for (GenericItem it : items){
            if(it.getCategorie() == Categories.DRESS){
                it.printAll();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }
}
