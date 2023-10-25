package NewtonSchoolAssignments;

import java.util.Scanner;

public class squareRootOfAnInteger {
    static int floorSqrt(int x)
    {
        // Base cases
        if (x == 0 || x == 1)
            return x;

        // Starting from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;

        while (result <= x) {
            i++; // 3
            result = i * i;
            System.out.println("result: " + result);
        }
        return i - 1;
    }

    // Driver program
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x, i;
        int t = input.nextInt();
        for(i=0; i<t; i++) {
            x = input.nextInt();
            System.out.print(floorSqrt(x));
        }

    }
}
