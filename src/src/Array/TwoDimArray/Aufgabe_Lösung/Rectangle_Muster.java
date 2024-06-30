package src.Array.TwoDimArray.Aufgabe_Lösung;

public class Rectangle_Muster {
    public static void main(String[] args) {
        char[][] array;
        int size = 9;
        if (size % 2 == 0) {
            array = new char[size + 1][size + 1];
        } else {
            array = new char[size][size];
        }

        fillWithRectangle_Muster(array);

        printArray(array);

    }

    public static void fillWithRectangle_Muster(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    array[i][j] = '*';
                } else if (i == array.length - 1) {
                    array[i][j] = '*';
                } else if (j == 0) {
                    array[i][j] = '*';
                } else if (j == array.length - 1) {
                    array[i][j] = '*';
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
