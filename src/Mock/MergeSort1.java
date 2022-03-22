package Mock;

public class MergeSort1 {
    static void mergeSort(int arr[], int left, int right) {
        if(left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int arr[], int left, int mid, int right) {
        int lSize = mid - left + 1;
        int rSize = right - mid;

        int leftArr[] = new int[lSize];
        int rightArr[] = new int[rSize];


        for(int i = 0; i < lSize; i++) {
            leftArr[i] = arr[left + i];
        }

        for(int i = 0; i < rSize; i++) {
            rightArr[i] = arr[mid + 1 + i];

        }

        int i = 0, j = 0, k = left;

        while (i < lSize && j < rSize) {
            if(leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i ++;
            }
            else {
                arr[k] = rightArr[j];
                j ++;
            }
            k ++;
        }

        while (i < lSize) {
            arr[k] = leftArr[i];
            i ++;
            k ++;
        }

        while (j < rSize) {
            arr[k] = rightArr[j];
            j ++;
            k ++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 30, 4, 96, 6, 55, 8};

        int left = 0;
        int right = arr.length;

        mergeSort(arr, left, right - 1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
