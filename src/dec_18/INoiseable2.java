package dec_18;

public interface INoiseable2 {

    default void moveForward(){
        System.out.println("Прибыл в точку B");
    }
}
