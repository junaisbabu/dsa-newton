package OwnEffect;

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for finding square root of that number: ");
        int num = input.nextInt();
        int i=1;

        while (i<=num/2) {
            if(num/i == i) {
                System.out.println(num+" Square root: "+i);
                break;
            }
            i++;

        }


    }
}
