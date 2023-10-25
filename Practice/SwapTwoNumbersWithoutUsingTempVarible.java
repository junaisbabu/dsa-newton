package Practice;

public class SwapTwoNumbersWithoutUsingTempVarible {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping : " + a + " " + b);

        a = a + b; // 30 = 10 + 20
        b = a - b; // 10 = 10 - 20
        a = a - b; // 20 = 30 - 10

        System.out.println("After swapping : " + a + " " + b);
    }
}
