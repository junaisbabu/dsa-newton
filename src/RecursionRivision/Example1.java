package RecursionRivision;

import java.util.Arrays;

public class Example1 {

    public static int[] array11(int[] arr, int index, int[] newArr) {
        if(index == arr.length)
            return newArr;

        newArr[arr.length - index - 1] = arr[index];
        return array11(arr, index + 1, newArr);
    }

    public static void main(String[] args) {
        int[] arr = {11, 2, 10, 80, 29, 40};
        int[] newArr = new int[arr.length];

        System.out.println(Arrays.toString(array11(arr, 0, newArr)));
    }



}
