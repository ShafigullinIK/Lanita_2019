package dec_18;

public class Car implements INoiseable {


    public void startEngine(){
        System.out.println("Вррррррррр");
    }

    @Override
    public void makeNoise() {
        System.out.println("Бибип");
    }
}
