package Seminar_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//
//        int[] array = {1,1,0,1,1,1};
//        System.out.println(calcMax(array, 1));
//
//        int[] array2 = {1,1,0,0,0,1};
//        System.out.println(calcMax(array2, 0));
//        int[] array = {3,2,2,3};
//        shift(array, 2);
//        System.out.println(Arrays.toString(array));
//
//        int[] array2 = {3,2,1,3,2,1};
//        shift(array2, 2);
//        System.out.println(Arrays.toString(array2));
        System.out.println(getCommonPrefix(new String[] {"aaab", "aaacc", "aaacd"}));
        System.out.println(getCommonPrefix(new String[] {"aaab", "aacc", "cd"}));


    }
    //{3,2,2,3}->val=3 -> {2,2,3,3}
    static String getCommonPrefix(String[] array) {
        String commonPrefix = array[0];
        for (int i = 1; i < array.length; i++) {
            String  second = array[i];
            int minLength = Math.min(commonPrefix.length(), second.length() );

            for (int j = 0; j < minLength; j++) {
                if (commonPrefix.charAt(j) != second.charAt(j)) {
                    commonPrefix = commonPrefix.substring(0, j);
                    break;
                }
            }
        }
        return commonPrefix;

    }
    static void shift(int[] array, int val) {
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a == val) {
                for (int j = array.length -1; j > i ; j--) {
                    if (array[j]!= val) {
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j]= tmp;
                        break;
                    }
                }
            }
        }


    }
    public static int calcMax(int[] array, int number) {
        int count =0;
        int maxCount =0;
        for (int a:array) {
            if (a == number) {
                count ++;
            }else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
            
        }
        if (count > maxCount) {
            maxCount = count;
        }

        return maxCount;

    }
    private static void arrayDemo() {
        int[] x = new int[5];
        int third = x[3];
        System.out.println(third);

        x[2] = -2;
        System.out.println(Arrays.toString(x));
    }

}
