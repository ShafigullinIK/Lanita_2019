package dec_16;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3,4);
        a.sum(b);
        System.out.println(a);
        Complex c = Complex.sum(a,b);
        System.out.println(c);
//        Person p = new Person();
//        p.name = "Vasya";
//        p.year = 5995;
//        p.setAge(-15);
//        System.out.println(p);
//        Bank bank = new Bank();
//        bank.setCash(50);
//        System.out.println(bank.getCash());
//        bank.setCash(-50);
//        System.out.println(bank.getCash());
    }
}
