package OwnEffect;

public class RecursionPower {
    static int findPower(int x, int n) {
        int result;
        if(n == 0) {
            result = 1;
        } else {
            result = x * findPower(x, n-1);
            System.out.println("Result: " + result);
        }
        return result;
    }

    public static void main(String[] args) {
       int power = findPower(10, 4);
        System.out.println(power);
    }
}
