package dec_16;

public class GenericItem {

    private static int countOfItems;

    private int id;
    private String name;
    private float price;

    public GenericItem(String name, float price){
        id = countOfItems;
        countOfItems++;
        this.name = name;
        this.price = price;
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

    public static int getStaticCountOfItems(){
        return countOfItems;
    }

    @Override
    public String toString() {
        return "GenericItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                "$}";
    }
}
