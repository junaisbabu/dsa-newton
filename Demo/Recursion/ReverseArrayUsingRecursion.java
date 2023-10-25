package Demo.Recursion;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {
    static int[] reverseArray(int[] arr, int index, int[] newArr) {
        if(index == arr.length) {
            return newArr;
        }

        newArr[arr.length - index - 1] = arr[index];

        return reverseArray(arr, index + 1, newArr);
    }

    public static void main(String[] args) {
        int[] arr = {88, 29, 8, 3, 4, 1};
        int[] newArr = new int[arr.length];

        newArr = reverseArray(arr, 0, newArr);

        System.out.println(Arrays.toString(newArr));
    }
}
