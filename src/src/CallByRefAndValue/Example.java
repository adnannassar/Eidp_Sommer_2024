package src.CallByRefAndValue;

public class Example {
    public static void main(String[] args) {
        int[] array = {10};
        int y = 20;
        System.out.println("Before X = " + array[0]);
        System.out.println("Before Y = " + y);
        incrementValue(array, y);
        System.out.println("After X = " + array[0]);
        System.out.println("After Y = " + y);

    }

    public static void incrementValue(int[] array, int value) {
        array[0]++;
        value++;
    }
}
