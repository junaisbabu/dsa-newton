package Arrays.OneDArrayMaths;

import java.util.Scanner;

public class MaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, N, first, second, third;
        first = second = third = 0;
        int T = input.nextInt();
        for(i=0; i<T; i++) {
            N = input.nextInt();
            int[] A = new int[N];
            for(j=0; j<N; j++) {
                A[j] = input.nextInt();
            }

            for(j=0; j<N; j++) {
                if(A[j] > first) {
                    third = second;
                    second = first;
                    first = A[j];
                } else if(A[j] > second) {
                    third = second;
                    second = A[j];
                } else if(A[j] > third) {
                    third = A[j];
                }
            }

            System.out.println();

            for(j=0; j<1; j++) {
                System.out.print(first+" "+second+" "+third);
                System.out.println();
            }
            System.out.println();

        }



    }
}


//3
//        5
//        1 4 2 4 5
//        6
//        1 3 5 7 9 8
//        7
//        11 22 33 44 55 66 77