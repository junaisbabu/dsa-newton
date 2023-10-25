package OwnEffect;

import java.util.Scanner;

public class SelectionSortExample1 {
    static int[] sortingFunc(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            int min = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {8, 2, 4, 1, 88, 40, 6, 27};
        int n = arr.length;

        int afterSorting[] = sortingFunc(arr);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
