package src.Array.TwoDimArray.Aufgabe_Lösung;

public class Muster_1_2_3_4 {
    public static void main(String[] args) {
        char[][] array;
        int size = 9;
        if (size % 2 == 0) {
            array = new char[size + 1][size + 1];
        } else {
            array = new char[size][size];
        }

        fillWithMuster_1_2_3_4(array);

        printArray(array);

    }

    public static void fillWithMuster_1_2_3_4(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = '*';
                } else if (i + j == array.length - 1) {
                    array[i][j] = '*';
                } else if (
                        i != 0
                                && i != array.length - 1
                                && j < array.length / 2
                                && i > j
                                && i + j < array.length - 1
                ) {
                    array[i][j] = '4';
                } else if (i < array.length / 2 && i + j < array.length - 1) {
                    array[i][j] = '1';
                } else if (i > array.length / 2 && i > j) {
                    array[i][j] = '3';
                } else if (j > array.length / 2 && j > i) {
                    array[i][j] = '2';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
