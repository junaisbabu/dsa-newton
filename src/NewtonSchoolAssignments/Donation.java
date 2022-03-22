package NewtonSchoolAssignments;

import java.util.Scanner;

public class Donation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];
        int i;

        for(i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }

        int max = 0;
        int result = 0;
        int count = 0;

        for(i=0; i<n; i++) {
            if(arr[i] > max) {
                System.out.print(0+" ");
                max = arr[i];
            } else if(arr[i] < max) {
//                count ++;
                result = max - arr[i];
                count += result;
                System.out.print(result+" ");




            } else if(arr[i] >= max || arr[i] <= max) {
                System.out.print(0+" ");
                max = arr[i];
            }

            count += arr[i];

        }
        System.out.println();

        System.out.print(count);

    }
}
