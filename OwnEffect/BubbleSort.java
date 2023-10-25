package OwnEffect;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {11, 3, 4, 6, 2, 44};
        int lenght = arr.length;

        for(int i=0; i < lenght - 1; i++) {
            for(int j=0; j < lenght - 1 - i; j++) {

                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<lenght; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
