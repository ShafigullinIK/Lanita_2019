package dec_16;

public class Methods {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 70;
//        int[] ar = {a,b,c, 15, 85, 19, 4};
        System.out.println(max(-1.0));
    }
    public static int max(int... a){
        if(a.length != 0){
            int max = a[0];
            for (int i = 0; i < a.length; i++) {
                if(max < a[i]){
                    max = a[i];
                }
            }
            return max;
        } else {
            return 0;
        }
    }

    public static double max(double d, int... a){
        int max = max(a);
        if(d>max){
            return d;
        } else {
            return max;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            System.out.println("check");
            return a;
        } else {
            System.out.println("check");
            return b;
        }
    }

    public static int max(int a, int b, int c){
        return max(max(a,b), c);
    }




}
