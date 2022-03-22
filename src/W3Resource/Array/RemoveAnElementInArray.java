package W3Resource.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveAnElementInArray {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};

        System.out.println("Orginal Array: " + Arrays.toString(arr));

        int removeIndex = 4;

        for(int i = removeIndex; i<arr.length -1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("After remove: " + Arrays.toString(arr));
    }
}
