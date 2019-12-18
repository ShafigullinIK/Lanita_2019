package dec_18;

public interface INoiseable {

    void makeNoise();
    default void moveForward(){
        System.out.println("Прибыл в точку A");
    }

}
