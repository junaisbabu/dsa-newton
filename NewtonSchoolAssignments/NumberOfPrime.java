package NewtonSchoolAssignments;

import java.util.Scanner;

public class NumberOfPrime {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int numToCheck = 2;

        while (numToCheck <= n) {
            boolean isPrime = true;
            int val = 2;
            while (val * val <= numToCheck) {
                if(numToCheck % val == 0) {
                    isPrime = false;
                    break;
                }
                val = val + 1;
                System.out.println(val);
            }
            if(isPrime == true) {
                count = count + 1;
            }
            numToCheck = numToCheck + 1;
        }
        System.out.println(count);
            }
        }

