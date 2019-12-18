package dec_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            public void comeBack(){
                System.out.println("Животное прибежало");
            }
        };
        Dog d = new Dog();
        Car c = new Car();
        d.sayHello();
        INoiseable[] in = new INoiseable[2];
        in[0] = d;
        in[1] = c;
        makeSomeNoise(in);
        c.startEngine();
        d.moveForward();
    }

    public static void makeSomeNoise(INoiseable[] c){
        for (INoiseable i:c) {
            i.makeNoise();
        }
    }


    public static int readInt() {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        try{
            String s = reader.readLine();
            a = Integer.parseInt(s);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Это не число");
        }
        return a;
    }

}
