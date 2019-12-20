package dec_20;

import Examples.ru.lanit.stocklist.GenericItem;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class IOTest {

    public static void main(String[] args) throws IOException {
        ArrayList<GenericItem> items = new ArrayList<>();
        BufferedReader reader =
                new BufferedReader(new FileReader("test.txt"));
        while(reader.ready()){
            String line = reader.readLine();
            items.add(stringToGenericItem(line));
        }
        reader.close();
        System.out.println(items);
    }

    public static GenericItem stringToGenericItem(String line) {
        String[] sArray = line.split(" ");
        String name = sArray[0];
        float price = Float.parseFloat(sArray[1]);
        GenericItem item = new GenericItem(name, price);
        return item;
    }

    public static void writeToFile() throws IOException {
        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter("test1.txt", false));
        writer.write("Первая строка нового файла");
        writer.newLine();
        writer.write("Вторая строка нового файла");
        writer.flush();
        writer.close();

    }

    public static void readFromFileExample() throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new FileReader("test.txt")
                );
        while (reader.ready()) {
            String line = reader.readLine();
            System.out.println("Строка файла = " + line);
        }
        reader.close();
    }

    public static void readExample() throws IOException {
        InputStream s = System.in;
        char c = (char) s.read();
        System.out.println("Вы ввели: " + c);
        System.out.println(s.read());
        InputStreamReader sReader = new InputStreamReader(s);
        c = (char) sReader.read();
        System.out.println(sReader.read());
        System.out.println("Вы ввели: " + c);
        BufferedReader reader = new BufferedReader(sReader);
        String line = reader.readLine();
        System.out.println("Вы ввели: " + line);
    }

}
