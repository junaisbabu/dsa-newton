package Searching;

import java.util.Scanner;

public class FindIndexUsingBinarySearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        int key = input.nextInt();
        int mid = 0;
                                                                       // { 1, 2, 3, 4, 5, 6, 7, 8 }
        while (start < end) {
            mid = start + (end - start) / 2;            // 0 + ( 7 - 0 ) / 2 = 3...  4 + ( 7 - 4 ) / 2 =

            if(key < arr[mid]) {
                end = mid - 1;
            } else if(key > arr[mid]) {
                start = mid + 1;
            } else {
                int index = mid;
                System.out.println("Found Index No: " + index);
                break;
            }
        }

        if(start > end) {
            System.out.println("Not Found");
        }
    }

}
