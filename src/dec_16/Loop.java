package dec_16;

public class Loop {

    public static void main(String[] args) {
        char counter = 'a';
//        while (counter == 'z') {
//            System.out.println(counter);
//            counter++;
//        }
//        boolean b = true;
//        boolean c = false;
//        if(b == true && c == true){
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        int a = 5;
        int b = 6;
        if(a == 5 && --b == 6){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(b);
    }
}
