package OwnEffect;

public class MergeSortExample3 {
            static void merge(int arr[], int left, int mid, int right) {
                int leftSize = mid - left + 1;
                int rightSize = right - mid;

                int leftArr[] = new int[leftSize];
                int rightArr[] = new int[rightSize];

                for(int i = 0; i < leftSize; i++) {
                    leftArr[i] = arr[left + i];
                }

                for(int i = 0; i < rightSize; i++) {
                    rightArr[i] = arr[mid + 1 + i];
                }

                int i = 0;
                int j = 0;
                int k = left;

                while (i < leftSize && j < rightSize) {

                    if(leftArr[i] < rightArr[j]) {
                        arr[k] = leftArr[i];
                        i++;

                    } else {
                        arr[k] = rightArr[j];
                        j++;

                    }
                    k++;

                }

                while (i < leftSize) {
                    arr[k] = leftArr[i];
                    i++;
                    k++;
                }
                while (j < rightSize) {
                    arr[k] = rightArr[j];
                    j++;
                    k++;
                }
            }

       static void mergeSort(int arr[], int start, int end) {
            if(start < end) {

                int mid = start + (end - start) / 2;

                mergeSort(arr, start, mid);
                mergeSort(arr, mid + 1, end);

                merge(arr, start, mid, end);
            }
        }


    public static void main(String[] args) {
        int arr[] = {33, 22, 55, 11, 7, 50};

        mergeSort(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}
