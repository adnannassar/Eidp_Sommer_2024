package src.Algorithmen.Temp;

public class MedianOfArray {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        int[] array3 = {0, 1, 2, 0, 0, 3, 0, 0, 0, 0, 5};

        System.out.println(medien(array1));
        System.out.println(medien(array2));
        System.out.println(medienMitNullen(array3));
    }

    private static int anzahlUngleichZero(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        return count;
    }

    private static float medien(int[] array) {
        bubbleSort(array);
        int arrayLength = array.length;
        if (arrayLength % 2 != 0) {
            return array[arrayLength / 2];
        } else {
            return (float) (array[arrayLength / 2] + array[(arrayLength / 2) - 1]) / 2;
        }
    }

    private static float medienMitNullen(int[] array) {
        int anzahlStelleUngleichZero = anzahlUngleichZero(array);
        int[] newArray = new int[anzahlStelleUngleichZero];
        for (int i = 0 , j = 0; i < array.length || j < newArray.length; i++) {
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }

        return medien(newArray);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
