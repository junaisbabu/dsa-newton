package OwnEffect;

public class MergeSortExample2 {

    static void mergeSort(int arr[], int lb, int ub) {
        System.out.println(ub);
        if(lb < ub) {
            int mid =   (lb+ub) / 2;

            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    static void merge(int arr[], int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;


        int newArr[] = new int[ub];

        while (i < mid && j < ub) {
            if(arr[i] < arr[j]) {
                newArr[k] = arr[i];
                i++;
            }
            else {
                newArr[k] = arr[j];
                j++;
            }
            k++;
        }

        if(i > mid) {
            while (j <= ub) {
                newArr[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                newArr[k] = arr[i];
                i++;
                k++;
            }
        }


        for(k = lb; k < ub; k++) {
            arr[k] = newArr[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 2, 2};

        int lb = 0;
        int ub = arr.length;


        mergeSort(arr, lb, ub);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
