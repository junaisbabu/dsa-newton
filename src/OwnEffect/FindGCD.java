package OwnEffect;

public class FindGCD {
    public static void main(String[] args) {
        int num1 = 12, num2 = 30;
        int minimum = 0;
        minimum = num1 < num2 ? num1 : num2;
        while (minimum >= 2) {
            if(num1 % minimum == 0 && num2 % minimum == 0) {

            }
            minimum --;
        }
        System.out.println(minimum);
    }
}
