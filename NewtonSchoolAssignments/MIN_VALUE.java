package NewtonSchoolAssignments;

import java.util.Scanner;

public class MIN_VALUE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        int smallest;

        for(int i=0; i<5; i++) {
            arr[i] = input.nextInt();

             smallest = Integer.MIN_VALUE;
            System.out.println(smallest);
        }



    }

}
