package dec_16;

public class Example {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        int[][] newArray =
                new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                newArray[j][i] = array[i][j];
            }
        }
        System.out.println(java.util.Arrays.deepToString(newArray));

    }

}
/* Решение:
 * 1. Создать новый объект нужной размерности. +
 * 2. Заполнить столбцы второй матрицы
 * элемнтами из строк первой матрицы.
 * */