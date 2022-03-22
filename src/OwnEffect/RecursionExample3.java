package OwnEffect;

public class RecursionExample3 {
        static int test(int x) {
            int sum = 0;
            if(x == 1)
                return 1;

            sum = x + test(x-1);

            return sum;
        }

    public static void main(String[] args) {

        int a = 5;
        int result = test(a);

        System.out.println("Result is : " + result);
    }
}
