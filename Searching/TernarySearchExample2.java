//package Searching;
//
//import java.util.Scanner;
//
//public class TernarySearchExample2 {
//
//    static void inputValues() {
//        int n, key;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the size of an Array");
//        n = input.nextInt();
//        System.out.println("Enter the value of an Array:");
//        int[] arr = new int[n];
//
//        for(int i=0; i<n; i++) {
//            arr[i] = input.nextInt();
//        }
//        System.out.println("Enter the find key:");
//        key = input.nextInt();
//
//        soulution(n, arr[], key);
//    }
//
//    static void soulution(int n, int arr[], int key) {
//        int start = 0;
//        int end = arr.length;
//        int mid1;
//        int mid2;
//
//        while (start < end) {
//            mid1 = start + (end - start) / 2;
//            mid2 = start + 2*(end - start) / 2;
//
//            if(arr[mid1] == key) {
//                System.out.println(mid1);
//            } else if(arr[mid2] == key) {
//                System.out.println(mid2);
//            } else if (key < arr[mid1]) {
//                end = mid1 - 1;
//            } else if (key > arr[mid2]) {
//                start = mid2 + 1;
//            } else {
//                end = mid1 + 1;
//                start = mid2 - 1;
//
//            }
//        }
//
//        if(start > end) {
//            System.out.println("Not found");
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        inputValues();
//    }
//}
