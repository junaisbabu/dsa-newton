package DSAWeekendContest;

import java.util.Scanner;

public class SimpleNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        int R = input.nextInt();
        int K = input.nextInt();

        int X = 0;

        if(R%K==0) { // 10 % 2 == 0
             X = R/K-X;  // R/k, X--, R/K-X

        }
        System.out.println(X);
    }






//    static long countDivisibles(long L, long R, Long K) {
//
//        if(L % K == 0) // 1 % 2 == 1 ...
//            return (R / K) - (L / K) + 1; // 8/2 - 2/2 + 1
//
//        return (R / K) - (L / K); // (10 / 2) - (1 / 2);
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        long L = input.nextLong();
//        long R = input.nextLong();
//        long K = input.nextLong();
//        System.out.println(countDivisibles(L, R, K));
//    }
}
