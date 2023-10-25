package OwnEffect;

public class QuickSortExample2 {
    static void quickSort(int arr[], int lb, int ub) {
        if(lb < ub) {
            int location = partition(arr, lb, ub);


            quickSort(arr, lb, location - 1);

            quickSort(arr, location + 1, ub);

        }

    }

    static int partition(int[] arr, int lb, int ub) {

        int pivot = lb;
        int start = lb+1;
        int end = ub;

        while (start <= end) {
            if(arr[start] > arr[pivot] && arr[end] < arr[pivot]){
                swap(arr, start, end);
                start++;
                end--;
            }


            if (arr[start] <= arr[pivot]) {
                start ++;

            }

            if (arr[end] > arr[pivot]) {
                end --;
            }

//            if(start < end) {
//                swap(arr, start, pivot);
//
//            }

        }

        swap(arr, lb, end);

        return end;
    }

    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {90, 10, 80, 40, 20, 50};
        int lenght = arr.length;


        quickSort(arr, 0, lenght-1);

        for(int i = 0; i < lenght; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
