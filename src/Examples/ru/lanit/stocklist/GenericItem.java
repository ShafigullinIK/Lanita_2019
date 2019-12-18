package Examples.ru.lanit.stocklist;

public class GenericItem {

    private static int countOfItems;

    private int id;
    private String name;
    private float price;
    private Categories categorie;

    public GenericItem() {

    }

    public GenericItem(String name, float price, GenericItem analog){
        this(name, price, analog.getCategorie());
    }

    public GenericItem(String name, float price) {
        this(name, price, Categories.GENERAL);
    }

    public GenericItem(
            String name,
            float price,
            Categories categorie) {
        id = countOfItems;
        countOfItems++;
        this.name = name;
        this.price = price;
        this.categorie = categorie;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getCountOfItems() {
        return countOfItems;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static int getStaticCountOfItems() {
        return countOfItems;
    }

    public static void setCountOfItems(int countOfItems) {
        GenericItem.countOfItems = countOfItems;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printAll() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("cat = " + categorie);
    }

    @Override
    public String toString() {
        return "GenericItem{" +
                "id=" + id +
                ", categorie= " + categorie +
                ", name='" + name + '\'' +
                ", price=" + price +
                "$}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GenericItem) {        // Проверяем, что obj является представителем класса GenericItem (или его наследником)
            GenericItem item = (GenericItem) obj;  // Приводим объект к типу GenericItem (выше убедились что это можно сделать)
            if (this.name.equals(item.name) &&
                    this.price == item.price &&
                    this.categorie == item.categorie) {
                return true;
            }
        }
        return false;
    }

}
