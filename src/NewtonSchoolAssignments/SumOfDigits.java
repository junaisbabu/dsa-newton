package NewtonSchoolAssignments;

import java.util.Scanner;

public class SumOfDigits {
    static int sumDigits(int no)
    {
        if(no == 0){
            return 0 ;
        }

        return (no % 10) + sumDigits(no / 10) ; // 5 + 2
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int number, sum;
        for(int i=0; i<t; i++) {
            number = input.nextInt();

            sum = sumDigits(number);
            System.out.println(sum);
        }


    }
}
