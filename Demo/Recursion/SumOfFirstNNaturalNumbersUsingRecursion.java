package Demo.Recursion;

public class SumOfFirstNNaturalNumbersUsingRecursion {
    static int add(int num) {
        if(num == 1)
            return num;

        return add(num - 1) + num;
    }


    public static void main(String[] args) {
        int num = 5;
        int sum = add(num);

        System.out.println(sum);
    }
}
