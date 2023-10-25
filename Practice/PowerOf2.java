package Practice;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int power = 0;
        int temp = 0;
        boolean t = false;


        while (temp < n) {
            temp = (int) Math.pow(2, power);
            System.out.println(temp);
            power ++;
//            System.out.println(power);

            if(temp == n)
                t = true;
        }

        if (t)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
