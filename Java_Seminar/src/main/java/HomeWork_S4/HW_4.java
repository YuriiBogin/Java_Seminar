package HomeWork_S4;

import java.util.LinkedList;
import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        LinkedList<String> inputLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String srtFromCons;

        System.out.println("Введите значение для строки.\nДля остановки ввода строк введите 'print'.\n" +
                "Для удаления последний строки введите 'revers'.\n" +
                "Для выхода введите 'exit'");

        while (!(srtFromCons = scanner.nextLine()).equals("print"))
            inputLinkedList.addFirst(srtFromCons);

        System.out.println("Получился перевёрнутый LinkedList: " + inputLinkedList.toString());


            if ((scanner.nextLine()).equals("revers")) {
                inputLinkedList.removeFirst();
                System.out.println("удаляем последнюю введенную строку" + inputLinkedList.toString());
            }

            if ((scanner.nextLine()).equals("exit")) {
                System.out.println("Выход из программы");
            }


        scanner.close();


    }

}
