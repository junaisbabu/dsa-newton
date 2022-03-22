package NewtonArena;

import java.util.Scanner;

public class ImplementQuickSort {
    public static int[] quickSort(int arr[], int start, int end)
    {
        if(start < end) {
           int partitionIndex = getPartitionIndex(arr, start, end);
            quickSort(arr, start, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }

        return arr;
    }

    static int getPartitionIndex(int arr[], int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for(int j = 0; j < high; j++) {
            if(arr[j] < pivot) {

                i++;

                swap(arr, i, j);
            }

        }

        swap(arr, i + 1, high);

        int partition = i + 1;

        return partition;
    }

    static void swap(int arr[], int index1, int intex2) {
            int temp = arr[index1];
            arr[index1] = arr[intex2];
            arr[intex2] = temp;
    }

    public static void main(String[] args) {

    }

}
