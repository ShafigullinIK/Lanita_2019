package dec_17;

public class Main {

    public static void main(String[] args) {

        PriceWithVersion price =
                new PriceWithVersion(150);
        System.out.println(price.toString());
        price.setPrice(145);
        System.out.println(price);
        price.setPrice(135);
        System.out.println(price);
        WithVersion<String> name = new WithVersion<>("Apple");
        System.out.println(name);
        name.setValue("Груши");
        System.out.println(name);
        name.setValue("Мандарины");
        System.out.println(name);

        Programmist p = new Programmist("Vasya", 25, Languages.FOXPRO);
        WithVersion<Programmist> person = new WithVersion<>(p);
        System.out.println(person);
        person.setValue(new Programmist("Petya", 19, Languages.JAVA));
        System.out.println(person);



//        SuperProgrammist sp = new SuperProgrammist("Vasya", 16, Languages.Cpp);
//        Person p1 = new Person("Vasya", 20);
//        Person pr1 = new Programmist("Petya", 35, Languages.JAVA);
//        Person pr2 = new Programmist("Nikolay", 54, Languages.FOXPRO);
//        Person t1 = new Tester("Sam", 19, 1);
//        Programmist pr3 = new Programmist("Sasha", 28, Languages.PASCAL);
//        Person[] group = new Person[4];
//        pr3.sayHelloWorld();
//        group[0] = p1;
//        group[1] = pr1;
//        group[2] = pr2;
//        group[3] = t1;
//        for (int i = 0; i < group.length; i++) {
//            group[i].printInfo();
//        }
//        for(Person p: group){
//            p.printInfo();
//        }
    }

}
