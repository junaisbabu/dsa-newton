package Demo.Recursion;

public class RecursionMultiplication {
    static int multiplication(int n, int i) {
        if(i == 0) {
            return 0;
        }

       multiplication(n, i - 1);
        int mul = i * n;
        System.out.println(i + " * " + n + " = " + mul);

        return mul;
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 10;
        System.out.println("Result " + multiplication(n, i));

    }
}
