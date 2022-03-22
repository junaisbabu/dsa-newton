package NewtonSchoolAssignments;

import java.util.Scanner;

public class One_Count {

    static int countOne(int[] arr, int small, int big) {
        if(big >= small) {
            int mid = small+(big - small);

            if((mid == big || arr[mid+1]==0) && arr[mid]==1) {
                return mid+1;
            }
            if(arr[mid] ==1) {
                return countOne(arr, (mid+1), big);
            }
            return countOne(arr, small, (mid-1));
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int i, j, n;
        for(i=0; i<t; i++) {
            n = input.nextInt();
            int arr[] = new int[n];

            for (j=0; j<n; j++) {
                arr[j] = input.nextInt();
            }

            System.out.println(countOne(arr, 0, n-1));
        }

    }
}
