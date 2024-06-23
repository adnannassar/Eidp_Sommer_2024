package src.Algorithmen.Temp;

public class MergeOfTwoArray {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};
        System.out.println("array1: ");
        printArray(array1);

        System.out.println("array2: ");
        printArray(array2);


        System.out.println("Merged array: ");
        printArray(merge2(array1, array2));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] array1, int[] array2) {
        int newLen = array1.length + array2.length;
        int[] mergedArray = new int[newLen];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0, j = array1.length; i < array2.length; i++, j++) {
            mergedArray[j] = array2[i];
        }

        return mergedArray;
    }

    public static int[] merge2(int[] array1, int[] array2) {
        int newLen = array1.length + array2.length;
        int[] mergedArray = new int[newLen];
        for (int i = 0, j = 0; i < array1.length; i++, j += 2) {
            mergedArray[j] = array1[i];
            mergedArray[j + 1] = array2[i];
        }

        return mergedArray;
    }
}
