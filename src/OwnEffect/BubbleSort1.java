package OwnEffect;

/*
Sorting only the positive numbers from an array A={12,34,-20,44,-10,56,-2,86,12},
 */

public class BubbleSort1 {
    public static void main(String[] args) {
        int arr[] = {12, 34, -20, 44, -10, 56, -2, 86, 12};

        int length = arr.length;

        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {

                if(arr[i] >= 0 && arr[j] >= 0) {
                    if(arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                    }

                }
            }
        }

        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
