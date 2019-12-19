package dec_19;

import Examples.ru.lanit.client.CatalogStubLoader;
import Examples.ru.lanit.stocklist.GenericItem;
import Examples.ru.lanit.stocklist.ItemCatalog;
import dec_17.Languages;
import dec_17.Person;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    static Integer[] m;

    public static void main(String[] args) throws InterruptedException {
        ArrayList<GenericItem> items = new ArrayList<>();
        ItemCatalog catalog = new ItemCatalog();
        CatalogStubLoader loader = new CatalogStubLoader();
        loader.load(catalog);
        items = catalog.getALCatalog();
        System.out.println(Arrays.toString(items.stream()
                .filter(i -> i.getName().equals("Apple"))
                .toArray()));
        int[] array = {7, 60, 7, 7, 7, 9, 10, -5};
        int[] newArray = Arrays.stream(array)
                .filter(x -> x>5)
                .sorted()
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(newArray));


    }

    public static void timerExample2(){
        //        KgToGramm converter = new KgToGramm();
        LambdaTest lambdaTest = new LambdaTest();
//        lambdaTest.print(KgToGramm::convertKgToGram, 15);
        lambdaTest.print(x -> x * 1000, 15);
        lambdaTest.print(x -> -1 * x, -15);
        lambdaTest.print(x -> x * x, -15);
        double value = -368;
//        value = lambdaTest.change(x -> Math.abs(x), value);
//        value = lambdaTest.change(x -> Math.sqrt(x), value);
        value = lambdaTest.change(x -> {
            x = Math.abs(x);
            x = Math.sqrt(x);
            x += 2;
            return x;
        }, value);
        System.out.println(value);
    }


    public static void timerExample() throws InterruptedException {

        Timer timer = new Timer();
        timer.start();
        System.out.println("Таймер запущен");
        Thread.sleep(2000);
        timer.interrupt();
        timer.join();
        System.out.println("таймер завершён");
    }

    public static void maxSearchExample() throws InterruptedException {
        int[] array = genArray(100_000_000);
        long start = System.currentTimeMillis();
        int max = max(array);
        long end = System.currentTimeMillis();
        System.out.println("Максимум = " + max);
        System.out.println("Время в N потоков = " + (end - start));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        start = System.currentTimeMillis();
        max = max(array, 0, array.length);
        end = System.currentTimeMillis();
        System.out.println("Максимум = " + max);
        System.out.println("Время = " + (end - start));
    }

    public static int max(int[] array) throws InterruptedException {
        int n = array.length;
        int m = 15;
        Thread[] threads = new Thread[m];
        MaxSearcher[] searchers = new MaxSearcher[m];
        for (int i = 0; i < m; i++) {
            searchers[i] = new MaxSearcher(array, i * n / m, (i + 1) * n / m);
            threads[i] = new Thread(searchers[i]);
            threads[i].start();
        }
        for (int i = 0; i < m; i++) {
            threads[i].join();
        }
        int[] maximums = new int[m];
        for (int i = 0; i < m; i++) {
            maximums[i] = searchers[i].max;
        }
        int max = max(maximums, 0, maximums.length);
        return max;
    }

    public static int max(int[] array, int start, int end) {
        int max = array[start];
        for (int j = 0; j < 100; j++) {
            for (int i = start; i < end; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
        }
        return max;
    }

    private static int[] genArray(int i) {
        int[] array = new int[i];
        Random r = new Random();
        for (int j = 0; j < array.length; j++) {
            array[j] = r.nextInt(1000);
        }
        return array;
    }

    public static void vaultExample() throws InterruptedException {
        Vault v = new Vault();
        AddVault add = new AddVault(v);
        MinVault min = new MinVault(v);
        Thread t1 = new Thread(add);
        Thread t2 = new Thread(min);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("значение = " + v.value);
    }
}
