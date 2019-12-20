package dec_20;

import Examples.ru.lanit.stocklist.GenericItem;

public class Converter implements IConvert {
    String line;

    public Converter(String line) {
        this.line = line;
    }

    @Override
    public GenericItem convert(String s) {
        String[] sArray = s.split(" ");
        String name = sArray[0];
        float price = Float.parseFloat(sArray[1]);
        GenericItem item = new GenericItem(name, price);
        return item;
    }

    public void print1(){
        System.out.println(line);
    }

    class MyNewClass{
        String s= "MyNewClass";

        public void print(){
            print1();
            System.out.println(s);
        }
    }
}
