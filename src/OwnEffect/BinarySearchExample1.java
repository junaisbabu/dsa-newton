package OwnEffect;

public class BinarySearchExample1 {
           static int binarySearch(int arr[], int n, int findNumber) {

               int l = 0;
               int r = n - 1;

               int mid = 0;

               while (l < r) {
                    mid = (l + r) / 2;

                   if(findNumber == arr[mid])
                       return mid;

                   else if(findNumber < arr[mid])
                       r = mid - 1;

                   else
                       l = mid + 1;
               }

                return mid;
            }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int findNumber = 7;

       int result = binarySearch(arr, n, findNumber);

        System.out.println(result);
    }
}
