package Oops.Constructor;

public class Constructor {
    int num1;
    int num2;
    int sum;

    Constructor() {
        num1 = 10;
        num2 = 20;

        sum = num1 + num2;
        System.out.println(num1 + " " + num2 + " " + sum);
    }

    Constructor(int a) {
        num1 = a;
        num2 = a;

        sum = num1 + num2;

        System.out.println(num1 + " " + num2 + " " + sum);
    }

    Constructor(int a, int b) {
        num1 = a;
        num2 = b;

        sum = num1 + num2;

        System.out.println(num1 + " " + num2 + " " + sum);
    }

    public static void main(String[] args) {
            int a = 100;
            int b = 200;
            Constructor constructor1 = new Constructor();
            Constructor constructor2 = new Constructor(a);
            Constructor constructor3 = new Constructor(a, b);
    }
}
