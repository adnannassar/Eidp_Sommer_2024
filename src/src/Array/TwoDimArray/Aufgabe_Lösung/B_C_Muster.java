package src.Array.TwoDimArray.Aufgabe_Lösung;

public class B_C_Muster {
    public static void main(String[] args) {
        char[][] array;
        int size = 13;
        if (size % 2 == 0) {
            array = new char[size + 1][size + 1];
        } else {
            array = new char[size][size];
        }

        fillWithB_C_Muster(array);

        printArray(array);

    }

    public static void fillWithB_C_Muster(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == array.length / 2) {
                    array[i][j] = 'B';
                } else if (i + j == (array.length + ((array.length / 2) - 1))) {
                    array[i][j] = 'B';
                } else if (i - j == array.length / 2) {
                    array[i][j] = 'C';
                }
                else if (j - i == array.length / 2) {
                    array[i][j] = 'C';
                }
                else {
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
