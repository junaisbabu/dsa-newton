package OwnEffect;
import java.sql.SQLOutput;
public class QuickSortExample1 {
       static void quickSort(int arr[], int lb, int ub) {
                if(lb < ub) {
                    int location = partition(arr, lb, ub);
                    System.out.println("location: " + location);

                    quickSort(arr, lb, location - 1);

                    quickSort(arr, location + 1, ub);
                }
        }
    static int partition (int arr[], int low, int high)
    {
        // pivot (Element to be placed at right position)
       int pivot = arr[high];

        int i = (low - 1);
        System.out.println("int i = " + i);

        for (int j = low; j <= high- 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;    // increment index of smaller element
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        System.out.println("i: " + i);
        return (i + 1);
    }
    static void swap(int arr[], int index1, int index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 6, 2, 4}; // 3 1 2  | 4 |  6 5    first iteration
        int lenght = arr.length;


        quickSort(arr, 0, lenght-1);

        for(int i = 0; i < lenght; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
