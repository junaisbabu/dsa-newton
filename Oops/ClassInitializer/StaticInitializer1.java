package Oops.ClassInitializer;

import java.util.Scanner;

public class StaticInitializer1 {

   static int arr[] = new int[5];

    static {

        System.out.println("In Static Initializer");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

    }

    public static void main(String[] args) {
        System.out.println("In main method");
        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
