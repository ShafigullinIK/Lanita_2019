package Examples.ru.lanit.client;

import Examples.ru.lanit.exceptions.CatalogLoadException;
import Examples.ru.lanit.stocklist.ItemCatalog;

public class MainGenericItem {

    public static void main(String[] args) {
        ItemCatalog catalog = new ItemCatalog();
        CatalogLoader loader = new CatalogStubLoader();
        try{
            loader.load(catalog);
        } catch (CatalogLoadException e){

        }

        testAL(catalog);
        testMap(catalog);
    }

    public static void testMap(ItemCatalog catalog){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000_000 ; i++) {
            catalog.findItemByID(8);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Время работы Map = " + (finish - start));
    }

    public static void testAL(ItemCatalog catalog){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000_000 ; i++) {
            catalog.findItemByIDAL(8);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Время работы AL = " + (finish - start));
    }
}
