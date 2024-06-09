package src.Array.OneDimArray;

public class SecondStep {
    public static void main(String[] args) {
        int[] array = new int[15];

        System.out.print("Before fill: ");
        printArray(array);

        fillArrayFromOneToLength(array);

        System.out.print("After fill:  ");
        printArray(array);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void fillArrayFromOneToLength(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void fillArrayFromOneToN(int array[], int n) {
        for (int i = 0; i < n; i++) {
            if (i < array.length) {
                array[i] = i + 1;
            }

        }
    }
}
