package Examples.ru.lanit.client;
import Examples.ru.lanit.exceptions.CatalogLoadException;
import Examples.ru.lanit.stocklist.ItemCatalog;

public interface CatalogLoader {
    void load(ItemCatalog cat) throws CatalogLoadException;
}
