package NewtonSchoolAssignments;

import java.util.Scanner;

public class MultiplyFirstDigitNumber {

    public static void main(String[] args) {
        int number, first_digit;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number that you wish : ");
        number = sc.nextInt();

        first_digit = number;
        while (first_digit >= 10) {
            first_digit = first_digit / 10;
        }

        System.out.println("\n The First Digit of a Given Number " + number + "  =  " + first_digit);


    }

}
