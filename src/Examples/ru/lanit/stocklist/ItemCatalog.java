package Examples.ru.lanit.stocklist;

import Examples.ru.lanit.exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {

    private HashMap<Integer, GenericItem> catalog =
            new HashMap<>();
    private ArrayList<GenericItem> ALCatalog =
            new ArrayList<>();

    public void addItem(GenericItem item){
        if(catalog.containsKey(item.getId())){
            throw new ItemAlreadyExistsException();
        }
        catalog.put(item.getId(), item);
        ALCatalog.add(item);
    }

    public void printItems(){
        for (GenericItem i:ALCatalog) {
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id){
        if(!catalog.containsKey(id)){
            return null;
        } else {
            return catalog.get(id);
        }
    }

    public ArrayList<GenericItem> getALCatalog() {
        return ALCatalog;
    }

    public GenericItem findItemByIDAL(int id){
        for (GenericItem i: ALCatalog) {
            if(i.getId() == id){
                return i;
            }
        }
        return null;
    }
}
