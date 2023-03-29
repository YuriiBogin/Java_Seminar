package HomeWork_S1;

import java.util.Arrays;
import java.util.Scanner;

public class HW_S1_2 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите длину массива:");
//        int len = in.nextInt();
//        System.out.println(createArray(len));

//        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        Array2(array);
//        System.out.println(Arrays.toString(array));
        int[][] array = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        ArraySq(array);
        System.out.println();
        int[][] array2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        ArraySq2(array2);
        //System.out.println(Arrays.deepToString(array));


    }

    // * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;//
    private static String createArray(int len) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = (int) (Math.random() * 2);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < len; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        }
        String ar = Arrays.toString(array);
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        return ar;
    }


    // * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void Array2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }

        }

    }

    // * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
// * * Также заполнить элементы побочной диагонали
    static void ArraySq(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void ArraySq2(int[][] array2) {
        for(int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (i + j + 1 == 4) {
                    array2[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                System.out.print(" " + array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
