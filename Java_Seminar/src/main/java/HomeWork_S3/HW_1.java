package HomeWork_S3;



import java.util.ArrayList;

import java.util.List;


public class HW_1 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        strings.add("17");
        System.out.println(strings); // [string, my_string]
        System.out.println("Удаляет четные числа");
        removeIntegers(strings);
        System.out.println("Удаляет целые числа");
        removeIntegers1(strings);
    }

    private static void removeIntegers(List<String> strings) {
        for (String a : strings) {
            try {
                int i = Integer.parseInt(a);
                if (i % 2 != 0) {
                    System.out.println(a);

                }

            } catch (NumberFormatException e) {
                System.out.println(a);
            }
        }

    }
    private static void removeIntegers1(List<String> strings) {
        for (String a : strings) {
            try {
                int i = Integer.parseInt(a);

            } catch (NumberFormatException e) {
                System.out.println(a);
            }
        }



    }
}



