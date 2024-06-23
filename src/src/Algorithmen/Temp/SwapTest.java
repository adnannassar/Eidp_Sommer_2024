package src.Algorithmen.Temp;

public class SwapTest {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before Swap: X = " + x + ", Y = " + y);

        int temp = x; // x = 10, y = 20, temp = 10
        x = y ;       // x = 20, y = 20, temp = 10
        y = temp ;    // x = 20, y = 10, temp = 10

        System.out.println("After  Swap: X = " + x + ", Y = " + y);

    }
}
