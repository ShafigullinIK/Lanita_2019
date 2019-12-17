package dec_17;

import java.util.LinkedList;

public class Programmist extends Person {

    private Languages lang;

    public Programmist(String name, int age, Languages lang){
        super(name, age);
        System.out.println("Programmist created");
        this.lang = lang;
    }

    public void sayHelloWorld(){
        System.out.println(lang + ": Hello world!");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("lang = " + lang);
    }

}
