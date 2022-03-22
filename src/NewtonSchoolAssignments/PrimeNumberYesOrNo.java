package NewtonSchoolAssignments;

import java.util.Scanner;

public class PrimeNumberYesOrNo {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        while(N!=0){

            N--;

            int number = sc.nextInt();
            boolean isPrime = true;
            if(number==0 || number==1){
                isPrime = false;
            }
            for(int i=2; i<=Math.sqrt(number);i++){
                System.out.println(Math.sqrt(number));
                if(number%i == 0){
                    isPrime = false;
                    break;
                }}
            if(isPrime)
                System.out.println("Yes");

            else
                System.out.println("No");

        }

    }
}

