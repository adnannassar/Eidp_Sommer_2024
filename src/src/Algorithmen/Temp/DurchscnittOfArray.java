package src.Algorithmen.Temp;

public class DurchscnittOfArray {
    public static void main(String[] args) {
        int[] array = {2, 4, -1, 9, 0};

        int summ = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] != -1) {
                count++;
                summ += array[i];
            }

        }

        System.out.println(summ / count);
    }
}


