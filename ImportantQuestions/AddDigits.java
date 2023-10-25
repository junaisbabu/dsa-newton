package ImportantQuestions;
/*

    Explanation: The process is
            38 --> 3 + 8 --> 11
            11 --> 1 + 1 --> 2
            Since 2 has only one digit, return it.

*/

public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        int digitalRoot = 0;
        while (num > 0) {
            digitalRoot += num % 10;

            num = num / 10;

            if(num == 0 && digitalRoot > 9) {
                num = digitalRoot;
                digitalRoot = 0;
            }
        }

        System.out.println(digitalRoot);
    }
}
