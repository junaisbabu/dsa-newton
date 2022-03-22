package OwnEffect;

import java.util.Arrays;

public class RemoveDuplicateElementInAnArray {
    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 2, 4, 8};

        Arrays.sort(arr);

        int j = 0;
        for(int i = 0; i < arr.length - 1; i ++) {
            if(arr[i] != arr[i + 1]) {
                arr[j] = arr[i];

                j ++;
            }
        }

        arr[j] = arr[arr.length - 1];

        for(int i = 0; i < j + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
