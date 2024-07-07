package src.Algorithmen.Temp;

import java.util.logging.Logger;

public class SubArray {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 0, 7, 3};
        int[] array2 = subArray(array, 1, 4);
        printArray(array);
        printArray(array2);

        char[] name = {'a', 'b', 'c'};
        String name2 = "abc";
    }

    private static int[] subArray(int[] array, int a, int b) {
        if ((a >= 0 && a < array.length) && (b >= 0 && b < array.length) && b > a) {
            int[] erg = new int[b - a + 1];
            for (int i = a, j = 0; i <= b; i++, j++) {
                erg[j] = array[i];
            }
            return erg;
        } else {
            return null;
        }
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

