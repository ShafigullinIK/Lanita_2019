package dec_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExThread implements Runnable {

    @Override
    public void run() {

        try (BufferedReader reader =
                     new BufferedReader(
                             new InputStreamReader(System.in))
        ) {
            for (int i = 0; i < 5; i++) {
                String s = reader.readLine();
                System.out.println("Вы ввели: " + s);
            }
        } catch (IOException e) {}
    }

}
