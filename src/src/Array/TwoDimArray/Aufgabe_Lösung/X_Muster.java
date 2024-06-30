package src.Array.TwoDimArray.Aufgabe_Lösung;

public class X_Muster {
    public static void main(String[] args) {
        char[][] array;
        int size = 7;
        if (size % 2 == 0) {
            array = new char[size + 1][size + 1];
        } else {
            array = new char[size][size];
        }

        fillWithX_Muster(array);

        printArray(array);

    }

    public static void fillWithX_Muster(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array.length / 2) {
                    array[i][j] = '*';
                } else if (i == array.length / 2) {
                    array[i][j] = '*';
                } else if (i == j) {
                    array[i][j] = '*';
                }
                else if (i + j == array.length -1) {
                    array[i][j] = '*';
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
