package Arrays.OneDArray;

public class SimpleArrangement {
//    public static void main(String[] args) {
//        int N =5;
//        int A[] = {4,2,3,0,1};
//        for(int i=0;i<N;i++){
//            A[i] = A[i] + (A[A[i]]%N)*N;
//        }
//        for(int i=0;i<N;i++){
//            System.out.println(A[i]/N);
//        }
//
//
//
////        int ar[] = new int[5];//Stores 5 integers, size of the array is 5
////        ar[0] = 10;//Store 1 at 0th index in the array
////        ar[1] = 89;//Store 89 at 1st index of the array
////        ar[2] = 39;
////        ar[3] = 44;
////        ar[4] = 59;
////
////        for(int val:ar) {
////            System.out.println(val);
////        }
//
//
//
//    }

    static boolean check(int arr[], int n)
    {
        // To store the number of modifications
        // required to make the array
        // strictly increasing
        int modify = 0;

        // Check whether the first element needs
        // to be modify or not
        if (arr[0] > arr[1]) {
            arr[0] = arr[1] / 2;
            modify++;
        }

        // Loop from 2nd element to the 2nd last element
        for (int i = 1; i < n - 1; i++) {

            // Check whether arr[i] needs to be modified
            if ((arr[i - 1] < arr[i] && arr[i + 1] < arr[i])
                    || (arr[i - 1] > arr[i] && arr[i + 1] > arr[i])) {

                // Modifying arr[i]
                arr[i] = (arr[i - 1] + arr[i + 1]) / 2;

                // Check if arr[i] is equal to any of
                // arr[i-1] or arr[i+1]
                if (arr[i] == arr[i - 1] || arr[i] == arr[i + 1])
                    return false;

                modify++;
            }
        }

        // Check whether the last element needs
        // to be modify or not
        if (arr[n - 1] < arr[n - 2])
            modify++;

        // If more than 1 modification is required
        if (modify > 1)
            return false;

        return true;
    }

    // Driver code
    public static void main(String[] args)
    {

        int[] arr = { 1, 3, 8, 4 };
        int n = arr.length;

        if (check(arr, n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
