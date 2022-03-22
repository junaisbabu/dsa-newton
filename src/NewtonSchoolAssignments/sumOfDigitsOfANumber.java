package NewtonSchoolAssignments;

import java.util.Scanner;

public class sumOfDigitsOfANumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();


        int sum = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            System.out.println("Last Digit:" + lastDigit);
            sum = sum + lastDigit;
            System.out.println("Sum:"+sum);
            number = number / 10;
            System.out.println("Number:"+number);
        }

        /*
        int sum = 0;
        for(; number > 0; number = number / 10) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
        }
        System.out.println("Sum: " + sum);
         */
    }
}
