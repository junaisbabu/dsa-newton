package Oops.Constructor;

public class ThisKeyword {

    int num1;
    int num2;

    String test;

    ThisKeyword(int num1, int num2, String str) {
        this.num1 = num1;
        this.num2 = num2;
        this.test = str;

        System.out.println(num1 + " " + num2 + " " + str);
    }

    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        String c = "Hello World!";
        ThisKeyword thisKeyword = new ThisKeyword(a, b, c);

        System.out.println(thisKeyword.num1);
        System.out.println(thisKeyword.num2);
    }
}
