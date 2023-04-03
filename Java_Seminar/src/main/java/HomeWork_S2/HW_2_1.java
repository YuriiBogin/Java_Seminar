package HomeWork_S2;

public class HW_2_1 {
    public static void main(String[] args) {
        buildString(6, 'x', 'y');

    }
//    Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//        Пример. (n = 6, c1='a', c2='b') -> "ababab"
//            (n = 8, c1='x', c2='y') -> "xyxyxyxy"

    static String buildString(int n, char c1, char c2) {
      StringBuilder str = new StringBuilder();
        for (int i = 1; i < (n/2)+1; i++) {
            str.append(c1);
            str.append(c2);
        }
       System.out.println("" + str);

        return null;
    }


}
