package Mock;

import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
//        [1, 2, 3, 6, 1, 3, 4, 6]
        int arr[] = {1, 2, 6, 1, 3, 4};

        Arrays.sort(arr);

        int j = 0;
        for(int i = 0; i < arr.length - 1 ; i++) {
            if(arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                    j++;
             }
        }

        arr[j] = arr[arr.length - 1];

        for(int i = 0; i < j + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
