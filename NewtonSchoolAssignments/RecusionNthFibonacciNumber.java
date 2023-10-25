package NewtonSchoolAssignments;

import java.util.Scanner;

public class RecusionNthFibonacciNumber {
    static int fib(int n)
    {
        System.out.println("n:  "+n);
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2); // 2 + 1
    }

    public static void main (String args[])
    {
        int n = 3;
        System.out.println(fib(n));
    }


    }

