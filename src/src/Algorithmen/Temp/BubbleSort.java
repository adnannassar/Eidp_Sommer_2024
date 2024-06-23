package src.Algorithmen.Temp;


public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 0, 7, 3};
        System.out.println("Before Sort: ");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nAfter  Sort: ");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 -i; j++) {
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
