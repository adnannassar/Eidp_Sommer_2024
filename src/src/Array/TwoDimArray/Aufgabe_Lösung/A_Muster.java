package src.Array.TwoDimArray.Aufgabe_Lösung;

public class A_Muster {
    public static void main(String[] args) {
        char[][] array;
        int size = 4;
        if (size % 2 == 0) {
            array = new char[size + 1][size + 1];
        } else {
            array = new char[size][size];
        }

        fillWithA_Muster(array);

        printArray(array);

    }

    public static void fillWithA_Muster(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    array[i][j] = 'A';
                } else if (i % 2 != 0 && j % 2 == 0) {
                    array[i][j] = 'A';
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
