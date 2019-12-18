package dec_18;

public class ExampleException {

    public static void main(String[] args) {
        System.out.println("b main");
        m1();
        System.out.println("a main");
    }

    public static void m1(){
        System.out.println("b m1");
        try{
            m2();
        } catch (RuntimeException e){
            System.out.println("catch in m1");
        }
        System.out.println("a m1");

    }

    public static void m2(){
        System.out.println("b m2");
        m3();
        System.out.println("a m2");
    }

    public static void m3(){
        System.out.println("b m3");
        if (true) throw new RuntimeException();
        System.out.println("a m3");
    }

}
