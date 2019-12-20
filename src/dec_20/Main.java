package dec_20;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Converter c = new Converter("Я первый конвертер");
        Converter.MyNewClass m = c.new MyNewClass();
        Converter c1 = new Converter("Я из второго конвертера");
        Converter.MyNewClass m1 = c1.new MyNewClass();

        m.print();
        m1.print();

    //        ArrayList<Integer> list = Stream
//                .iterate(1, x -> x + 1)
//                .filter(Main::isPrime)
//                .limit(5000)
//                .collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(list);


    }

    public static void myPrint(Object o) {
        System.out.print(o + " | ");
    }

    public static boolean isPrime(long x) {
        if (x == 1 || x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        double sqrt = Math.sqrt(x);
        for (int i = 3; i <= sqrt; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
