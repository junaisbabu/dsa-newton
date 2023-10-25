package OwnEffect;

public class RecursionFactorial {

    static int factorial = 0;

    static int getFactorial(int n) {
        if(n == 1) {
            factorial = 1;
        }

        else {
            factorial = n * getFactorial(n - 1);
        }
        return factorial;
    }

    public static void main(String[] args) {
//        int factorialResult = getFactorial(4);
//
//        System.out.println(factorialResult);
        System.out.println(getFactorial(4));
    }
}
