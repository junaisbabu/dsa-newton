package OwnEffect;

public class BubbleSortRemoveOddNumbers {

    public static void main(String[] args) {
        int arr[] = {55, 94, 13, 65, 22, 21};

        int length = arr.length;

        int newArr[] = new int[length];
        for(int i = 0; i < length-1; i++) {
            for(int j=0; j < length-1; j++) {

                        if(arr[j] > arr[j+1]) {
                           int temp = arr[j];
                           arr[j] = arr[j+1];
                           arr[j+1] = temp;
                        }
            }
        }

        for(int i = 0; i < length; i++) {
            if(arr[i] % 2 == 0) {
                newArr[i] = arr[i];
            }
        }

        for(int i = 0; i < length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

}
