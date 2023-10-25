package OwnEffect;

public class RecursionSumOfNumbers {
    static int add(int n) {
        if(n == 1)
            return 1;

        return n + add(n-1);
    }
    public static void main(String[] args) {
        int sum = add(6);
        System.out.println(sum);
    }
}
