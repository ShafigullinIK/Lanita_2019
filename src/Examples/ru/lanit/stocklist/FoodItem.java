package Examples.ru.lanit.stocklist;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FoodItem extends GenericItem {

    private GregorianCalendar dateOfIncome;
    private short expires;

    public FoodItem(
            String name,
            float price,
            Categories cat,
            GregorianCalendar date,
            short expires) {
        super(name, price, cat);
        this.dateOfIncome = date;
        this.expires = expires;
    }

    public FoodItem(
            String name,
            float price,
            FoodItem analog,
            GregorianCalendar date,
            short expires){
        this(name, price, analog.getCategorie(), date, expires);
    }

    public FoodItem(
            String name,
            float price,
            GregorianCalendar date,
            short expires) {
        this(name, price, Categories.FOOD, date, expires);
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.println(dateOfIncome.get(Calendar.DAY_OF_MONTH) +
                " / " + dateOfIncome.get(Calendar.MONTH) +
                " / " + dateOfIncome.get(Calendar.YEAR));
        System.out.println("Срок годности = " + expires + " дней");
    }
}
