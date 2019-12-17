package dec_16;

public class MainGenericItem {

    public static void main(String[] args) {
        System.out.println(GenericItem.getStaticCountOfItems());
        GenericItem item = new GenericItem("TV", 150);
        System.out.println(item.getCountOfItems());
        System.out.println(item);
        GenericItem item2 = new GenericItem("Radio", 100);
        System.out.println(item.getCountOfItems());
        System.out.println(item2);
        GenericItem item3 = new GenericItem("PC", 120.5f);
        System.out.println(item3);
        System.out.println(item.getCountOfItems());
    }
}
