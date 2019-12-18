package dec_18;

public class Dog extends Animal implements INoiseable, INoiseable2 {


    public void sayHello(){
        System.out.println("Машет хвостом");
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав, Гав, Гав!");
    }

    @Override
    public void moveForward() {

        System.out.println("Собака прибыла в точку C");
    }

    @Override
    public void comeBack() {
        System.out.println("Прибежала");
    }
}
