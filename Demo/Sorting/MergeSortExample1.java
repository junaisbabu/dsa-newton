package Demo.Sorting;

public class MergeSortExample1 {

    static void mergeSort(int arr[], int left, int right) {
        if(left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid,  right);
        }

    }

    static void merge(int arr[], int left, int mid, int right) {
        int lSize = mid - left + 1;
        int rSize = right - mid;

        int[] lArr = new int[lSize];
        int[] rArr = new int[rSize];

        for(int i = 0; i < lSize; i++) {
            lArr[i] = arr[left + i];
        }

        for(int i = 0; i < rSize; i++) {
            rArr[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0, k = left;
        while (i < lSize && j < rSize) {

            if(lArr[i] < rArr[j]) {
                arr[k] = lArr[i];
                i ++;
            } else {
                arr[k] = rArr[j];
                j ++;
            }
            k ++;
        }

        while (i < lSize) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j < rSize) {
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] {100, 50, 20, 60, 10, 30, 80};

        int length = arr.length;

        mergeSort(arr, 0, length - 1);

        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
