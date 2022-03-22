package NewtonSchoolAssignments;

import java.util.Scanner;

public class AppleOrange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();

        if(n<(a+b)) {
            System.out.println((a+b)-n);
        } else {
            System.out.println("0");
        }
    }

}
