package OwnEffect;

public class QuickSortExample3 {
        static void quickSort(int arr[], int lb, int ub) {
            if(lb < ub) {
                int loc = getPartitionIndex(arr, lb, ub);
                quickSort(arr, lb, loc - 1);
                quickSort(arr, loc + 1, ub);
            }

        }

        static int getPartitionIndex(int arr[], int low, int high) {
            int pivot = arr[high];
            int i = (low - 1);

            for(int j = low; j < high; j++) {
                if(arr[j] <= pivot) {
                    i++;
                    // swap arr[i] & arr[j]
                    swap(arr, i, j);
                }
            }
            int partitionIndex = i + 1;
            // swap arr[i+1] & arr[high]
            swap(arr, partitionIndex, high);

            return partitionIndex;
        }

        static void swap(int arr[], int index1, int index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }

    public static void main(String[] args) {
        int arr[] = {33, 22, 66, 21, 9, 5};

        quickSort(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
