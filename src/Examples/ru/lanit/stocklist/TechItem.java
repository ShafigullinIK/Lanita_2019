package Examples.ru.lanit.stocklist;

public class TechItem extends GenericItem {

    private short warrantyTime;

    public TechItem(
            String name,
            float price,
            Categories cat,
            short warrantyTime) {
        super(name, price, cat);
        this.warrantyTime = warrantyTime;
    }

    public TechItem(
            String name,
            float price,
            short warrantyTime) {
        this(name, price, Categories.GENERAL, warrantyTime);
    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.println(
                "гарантийный период = " +
                        warrantyTime);
    }
}
