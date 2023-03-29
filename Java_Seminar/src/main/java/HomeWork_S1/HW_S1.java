package HomeWork_S1;

import java.util.Arrays;
import java.util.Scanner;

public class HW_S1 {
    public static void main(String[] args) {
        System.out.println("проверить, что сумма a и b лежит между 10 и 20");
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println("проверить, что х положительное");
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        System.out.println("напечатать строку source repeat раз");
        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println("проверить, является ли год високосным. если да - return true");
        System.out.println("Введите год:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isLeapYear(num));

        System.out.println("должен вернуть массив длины len, каждое значение которого равно initialValue");
        System.out.println("Введите длину массива:");
        int len = in.nextInt();
        System.out.println("Введите значение элемента:");
        int initialValue = in.nextInt();
        System.out.println(createArray(len, initialValue));


        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {

        if (((a + b) > 10) && ((a + b) <= 20)) return true;
        // проверить, что сумма a и b лежит между 10 и 20
        return false;
    }

    private static boolean isPositive(int x) {
        if (x > 0) return true;
        // проверить, что х положительное
        return false;
    }

    private static void printString(String source, int repeat) {
        System.out.println("" + source.repeat(repeat));
        // напечатать строку source repeat раз
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        return false;
    }

    private static String createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        String ar = Arrays.toString(array);
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        return ar;
    }

}




