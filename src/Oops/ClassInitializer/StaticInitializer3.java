package Oops.ClassInitializer;

import java.util.Scanner;

public class StaticInitializer3 {
    static int arr[] = new int[5];

    static int num = 935403668;

    StaticInitializer3() {
        System.out.println("In Constructor");

        System.out.println("My Mobile No: " + num);
    }

    static {

        System.out.println("In Static Initializer");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        System.out.println("In main method");
        StaticInitializer3 staticInitializer3 = new StaticInitializer3();
    }
}
