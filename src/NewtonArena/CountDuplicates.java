package NewtonArena;

import java.util.Scanner;

public class CountDuplicates {
    static void sortFunc(int arr[], int n) {

        int i, j, temp = 0, count = 1;
        int sequence = 1;
        for(i = 0; i < n - 1; i++) {
            for(j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

         for(i = 0; i < n - 1; i++) {
             if(arr[i] == arr[i + 1]) {
                 System.out.print(arr[i] + " ");

             }

         }






    }

    public static void main (String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int arr[] = new int[n];

        int i, j, count = 0;

        for(i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        sortFunc(arr, n);


    }

}


/*
5
1 2 1 1 2
 */