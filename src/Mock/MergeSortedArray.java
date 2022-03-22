package Mock;

public class MergeSortedArray {
    /*[4,7,19]

            [1,5,6,8]

            [1,4,5,6,7,8,9]*/

    public static void main(String[] args) {
        int arr1[] = {4, 7, 9};
        int arr2[] = {1, 5, 6, 8};

        int newArr[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                newArr[k] = arr1[i];
                i ++;
            }
            else {
                newArr[k] = arr2[j];
                j ++;
            }
            k ++;
        }

        while (i < arr1.length) {
            newArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            newArr[k] = arr2[j];
            j++;
            k++;
        }


        for(int h = 0; h < newArr.length; h++) {
            System.out.print(newArr[h] + " ");
        }
    }
}
