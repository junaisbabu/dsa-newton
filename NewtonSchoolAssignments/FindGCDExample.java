package NewtonSchoolAssignments;

import java.util.Scanner;

public class FindGCDExample {

    public static void main(String[] args)
    {
//x and y are the numbers to find the GCF
        int x = 12, y = 30, gcd = 1;

//running loop form 1 to the smallest of both numbers
        for(int i = 1; i <= x && i <= y; i++)

        // 1 <= 12 && 1 <= 8;
        // 2 <= 12 && 2 <= 8;
        // 3 <= 12 && 3 <= 8;
        // 4 <= 12 && 4 <= 8;
        // 5 <= 12 && 5 <= 8;
        // 6 <= 12 && 6 <= 8;
        // 7 <= 12 && 7 <= 8;
        // 8 <= 12 && 8 <= 8;

        {
//returns true if both conditions are satisfied
            if(x%i==0 && y%i==0){

                // 12 % 1 == 0 && 8 % 1 == 0     gcd = 1
                // 12 % 2 == 0 && 8 % 2 == 0     gcd = 2
                // 12 % 3 == 0 && 8 % 3 == 1     gcd = 3
                // 12 % 4 == 0 && 8 % 4 == 0     gcd = 4
                // 12 % 5 == 1 && 8 % 5 == 1     gcd = 5
                // 12 % 6 == 0 && 8 % 6 == 1     gcd = 6
                // 12 % 7 == 1 && 8 % 7 == 1     gcd = 7
                // 12 % 8 == 1 && 8 % 8 == 0     gcd = 8


//storing the variable i in the variable gcd
                gcd = i;
            System.out.println("gcd"+ "=" + gcd);}
        }
//prints the gcd
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);



//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        int b = s.nextInt();
//        if(a==0 || b==0)
//        {
//            System.out.println(-1);
//            return;
//        }
//        if (b<a)
//        {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//
//        while(b%a!=0)
//        {
//            int r = b%a;
//            b = a;
//            a = r;
//        }
//
//        System.out.println("HCF/GCD is ");
//        System.out.println(a);
    }
}
