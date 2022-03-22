package Practice;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean isPrime = true;

        // start from 2 to ( n-1 )

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}
