package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7, 11, 3, 10, 9, 15, -17, 100};
        int length = arr.length;

        for(int i = 0; i < (length - 1); i++) {
            int minIndex = i;
            for(int j = (i + 1); j < length; j++) {
                if(arr[j] < arr[minIndex]) {  // 11 < 7. 3 < 7

                    minIndex = j;  // 2 = 2;
                }
            }

            //swap minIndex and i
            int temp = arr[minIndex]; // -17
            arr[minIndex] = arr[i]; // 7
            arr[i] = temp; // 17

        }

        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
