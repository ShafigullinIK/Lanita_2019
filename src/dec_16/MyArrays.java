package dec_16;

import java.util.Random;
import java.util.Arrays;

public class MyArrays {

    static int a = 5;

    public static void main(String[] args) {
        Integer a = 5_000_000;
        Integer b = toSquare(a);
        System.out.println(toSquare(4.2));
        System.out.println(b);
        Random r = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = r.nextInt(15);
        }
        String s = java.util.Arrays.toString(array);
        System.out.println(s);
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        int[][] dArray = new int[][]{{1,2},{3,4,5}};
        String s2 = Arrays.deepToString(dArray);
        System.out.println(s2);
        printArray(dArray);
        printArray(dArray);
    }

    private static final void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int toSquare(int a){
        return a*a;
    }

    public static double toSquare(double a){
        return a*a;
    }


}
