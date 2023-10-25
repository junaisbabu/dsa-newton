package NewtonSchoolAssignments;

public class ReversePrintingInAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
//
        System.out.println("There are Two methods\n");
        System.out.println("First Method:");
        for(int i = 0; i < n; i++) {
            System.out.println(arr[n - 1 - i]);
        }

        System.out.println("Second Method:");
        for(int i = n-1 ; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
