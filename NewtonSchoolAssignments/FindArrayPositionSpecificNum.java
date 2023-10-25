package NewtonSchoolAssignments;

import java.util.Scanner;

public class FindArrayPositionSpecificNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = input.nextInt();

        int i;
        int[] arr = new int[size];
        System.out.println("Enter the values of an Array");
        for(i=0; i<size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the num for finding position:");
        int num = input.nextInt();

        int position = 0, flag = 0;

        for(i=0; i<size; i++) {
            if(num == arr[i]) {
                 position = i + 1;
                System.out.println("Position of this number is: "+position);
                flag = 1;
            }
        }
        if(flag==0)
        System.out.println("Invalid number which you given:" + num);

    }

}
