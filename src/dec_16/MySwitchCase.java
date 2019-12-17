package dec_16;

public class MySwitchCase {

    public static void main(String[] args) {
        int x = 3;
        switch (x) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
//                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println("default");
        }
        label:
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    break label;
                }
                System.out.println(i);
            }
        }
    }
}
