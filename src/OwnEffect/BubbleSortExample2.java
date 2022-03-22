package OwnEffect;

public class BubbleSortExample2 {

    public static void main(String[] args) {
        int arr[] = {44, 33, 22, 9, 2};

        int length = arr.length;

        for(int i = 0; i < length - 1; i++) {
            for(int j = 0; j < length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
